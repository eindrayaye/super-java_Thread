public class ThreadTryInMain extends Thread{
	
	public void run()
	{
		String[] wall = new String[5];
		for (int i=0; i<wall.length; i++)
		{
			for (int j=i; j<wall.length;j++) {
				System.out.println(" " + "RED" + " " + "BLACK");
			}
			System.out.println();
		}
	}
	
	public static void main (String args[])
	{
		ThreadTryInMain t1=new ThreadTryInMain();
		//Brick2 t2= new Brick2();
		
		t1.start();
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ex)
		{
			System.out.println("Thread interrupted!");
		}
		//t2.start();
	}

}
