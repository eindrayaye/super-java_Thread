public class MyRunnableMultiThreadExamp implements Runnable{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("The num is : " + i);
			System.out.println(" The Thread count is " + Thread.currentThread().getName());
			try
			{
			Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				System.out.println("Thread count");
			}
		}
	}
	
	public static void main(String args[])
	{
		Thread tt1=new Thread (new MyRunnableMultiThreadExamp());
		Thread tt2=new Thread (new MyRunnableMultiThreadExamp());
		tt1.start();
		tt1.setName("First Thread write in here");
		//tt2.start();
		tt2.setName("The second Thread ");
	}

}
