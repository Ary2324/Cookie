/*
 * 27.10.2020 Runnable
 * 27.10.2019 Original version
 */


public class ProdCons
{
	public static void main( String[] args )
	{
		new ProdCons().run();
	}
	
	
	private void run()
	{
		Buffer<Integer> buffer = new CookieJarBuffer<Integer>();
		
		Thread prod = new Thread( new Producer( buffer ) );
		Thread cons = new Thread( new Consumer( buffer ) );

		prod.start();
		cons.start();
	}
}
