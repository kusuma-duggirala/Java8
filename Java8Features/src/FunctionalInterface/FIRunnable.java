package FunctionalInterface;

public class FIRunnable implements Runnable
{
	@Override
	public void run() //Implementing the interface unimplemented methods
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
		
	}
	
	public static void main(String[] args) 
	{
		Runnable r=new FIRunnable();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
		

	}

}
