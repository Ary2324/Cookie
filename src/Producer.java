/*
 * 27.10.2020 Runnable
 * 27.10.2019 Original version
 */


import java.util.Random;


public class Producer implements Runnable
{
	private static final int MAX_PROD_TIME = 5000; // 5 seconds

	private static final Random random = new Random();
	
	private Buffer<Integer> buffer;
	
	public Producer( Buffer<Integer> buffer )
	{
		this.buffer = buffer;
	}

	@Override
	public void run()
	{
		while( true ) {
			try {
				Thread.sleep( random.nextInt( MAX_PROD_TIME ) );
			} catch( InterruptedException ex ) {
			}

			int cookie = random.nextInt();
			System.out.println( "put(" + cookie + ") trying" );
			buffer.put( cookie );
			System.out.println( "put(" + cookie + ") done" );
		}
	}
}
