package hierarchicalInheritance;

public class FatherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son s1=new Son();
		s1.setDataFather(24, "ABC", "XYZ");
		s1.setDataSon("Be","raj");
		s1.display();
		
	//	System.out.println(s1);
		
		Daughter d=new Daughter();
		d.setDataFather(25, "abc", "xyz");
		d.setDataDaughter("jkdgd", "f");
		d.display();
		
		
		
	}

}
