public class MyNewThreadExample extends Thread
{
	public void run()
	{
		for (int i = 0; i <10; i++)
		{
			System.out.println("The numver is : " + i);
			
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				System.out.println("Thread Error!");
			}
		}
	
	}
	
	public static void main (String args[])
	{
		MyNewThreadExample t= new MyNewThreadExample();
		t.start();
	}

}
