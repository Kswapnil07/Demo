package Multithread;

public class MyThread implements Runnable {
	
	public void run()
	{
		for(int i=5;i>=1;i--)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
