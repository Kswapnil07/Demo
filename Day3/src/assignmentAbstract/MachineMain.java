package assignmentAbstract;

public class MachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		M_Juicer j=new M_Juicer();
		j.crush();
		j.filter();
		j.rotate();
		
		System.out.println();
		
		Machine m=new M_Juicer();
		m.crush();
		m.rotate();
		
	}

}
