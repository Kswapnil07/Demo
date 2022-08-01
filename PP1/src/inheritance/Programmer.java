package inheritance;

public class Programmer extends Employee {
	
	int bonous=10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Programmer p=new Programmer();
		System.out.println(p.id+" "+p.salary+" "+p.bonous);
	}

}
