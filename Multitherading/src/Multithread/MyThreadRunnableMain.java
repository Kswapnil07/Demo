package Multithread;

public class MyThreadRunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread obj= new MyThread();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		
		t1.start();
		t2.start();
		
		
	//	t1.run();

		
	}

}
