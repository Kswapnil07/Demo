package Multithread;

public class Task1 extends Thread {

	Task1(String s)
	{
		super(s);
	}
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
//		try {
//			Thread.sleep(1000);;
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Thread.yield();//same priority thread to execute /it will allow low priority
}
}
