package Multithread;

public class TaskThreadMain1 {

	public static void main(String[] args) {
	Task1 t1=new Task1("AA");
	Task1 t2=new Task1("BB");
	Task1 t3=new Task1("CC");
	
	t1.setName("Thread A");
	t2.setName("Thread B");
	t3.setName("Thread C");

	t1.setPriority(8);
	t2.setPriority(5);
	t3.setPriority(3);
	
	
	t1.start();
//	try {
//		t1.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	t2.start();
//	try {
//		t2.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	t3.start();
}
}