package hierarchical;

public class Father {

	int age;
	String name;
	void data(int age,String name)
	{
		this.age=age;
		this.name=name;
		
	}
	
	void display() {
		System.out.println(age+" "+name);
	}
}
