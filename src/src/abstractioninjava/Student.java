package abstractioninjava;

public class Student implements College{

	@Override
	public void uniform() {
		// TODO Auto-generated method stub
		System.out.println("uniform Collected");
		
	}

	@Override
	public void idCard() {
		// TODO Auto-generated method stub
		System.out.println("id card collected");
	}

	@Override
	public void transport() {
		// TODO Auto-generated method stub
		System.out.println("not needed");
	}
	
	
	
}
