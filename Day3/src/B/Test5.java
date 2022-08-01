package B;
import A.Test1;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		//System.out.println(t1.a);//same package
		//System.out.println(t1.b);//private
		//System.out.println(t1.c);//protected
		System.out.println(t1.d);
		t1.display();
	}

}
