package hierarchicalInheritance;

public class Father {

	int age;
	String name,sirname;
	void setDataFather(int age,String name,String sirname) {
		this.age=age;
		this.name=name;
		this.sirname=sirname;
	}
	void display() {
		
		System.out.println(age+" "+name+" "+sirname);
	}
}
