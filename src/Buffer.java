/*
 * 08.11.2022 Reundant stuff removed
 * 27.10.2019 Original version
 */


public interface Buffer<T>
{
	void put( T cookie );
	
	T take();
}
