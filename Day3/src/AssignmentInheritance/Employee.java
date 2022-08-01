package AssignmentInheritance;

public class Employee extends Bank {
	
	int id;
	String name;
	
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String toString () {
		return micrno+" "+bname+" "+id+" "+name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		e.setMicrno(78945612);
		e.setBname("SBI");
		e.setId(101);
		e.setName("raju");
		System.out.println(e);
	}

}
