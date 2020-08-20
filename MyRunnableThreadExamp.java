public class MyRunnableThreadExamp implements Runnable {
	public void run()
	{
		for (int x =0; x < 10; x++)
		{
			System.out.println("The number is: "+ x);
			System.out.println("The First Thread - " + Thread.currentThread().getName());
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				System.out.print("Thread Error!");
			}
		}   
	}
	
	public static void main (String args[])
	{
		Thread t1= new Thread(new MyRunnableThreadExamp());
		t1.start();	
		t1.setName("First Thread");
	
	}
	

}
