/*
 * 27.10.2019 Original version
 */


public class CookieJarBuffer<T> implements Buffer<T>
{
	private T value;
	private boolean ready = false;

	@Override
	public void put( T value )
	{
		while( ready )
			Thread.yield();
		
		this.value = value;
		ready = true;
	}
	
	@Override
	public T take()
	{
		while( !ready )
			Thread.yield();

		T result = value;
		ready = false;
		
		return result;
	}
}
