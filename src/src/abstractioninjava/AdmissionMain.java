package abstractioninjava;

public class AdmissionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Admission.name);
		//Admission a1= new Student();
		Student s1= new Student();
		//System.out.println(s1.name);
	
		s1.uniform();
		s1.idCard();
		s1.transport();
		s1.library();
		s1.canteen();
		
		College.labratory();

		
	}

}
