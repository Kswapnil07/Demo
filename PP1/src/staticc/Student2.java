package staticc;

public class Student2 {

	int id;
	String name;
	static String college="abc";
	
	static void college1()
	{
		college="kjcoemr";
	}
	Student2(int i,String n){
		
		id=i;
		name=n;
	}
	void dispaly() {
		System.out.println(id+" "+name+" "+college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2.college1();
		Student2 s=new Student2(101,"tej");
	
		s.dispaly();
	}

}
