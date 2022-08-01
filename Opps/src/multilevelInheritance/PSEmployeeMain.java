package multilevelInheritance;

public class PSEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s =new Student();
		s.setDataPerson("abc", " 45167", " pune");
		s.setDataStudent(101, 60, "HR");
		s.grade();
		s.display();
		
		Employee e=new Employee();
		e.setDataEmployee(102, 50000, "HR");
		e.setDataPerson("ram", "462824", "pune");
		e.pf();
		e.display();
	}

}
