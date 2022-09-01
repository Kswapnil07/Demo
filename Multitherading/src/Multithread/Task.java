package Multithread;

public class Task extends Thread {
	Task(String s)
	{
		super(s);
	}
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		try {
			Thread.sleep(1000);;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
