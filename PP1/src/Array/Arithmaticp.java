package Array;

public class Arithmaticp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s=2;
		int n=3;
		int f=5;
		
		int d=n-s;
		
		int a=s%d;
		
		for(int i=a;i<f;i++) {
			a=a+d;
		}
		System.out.println(a);
	}

}
