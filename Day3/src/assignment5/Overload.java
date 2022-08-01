package assignment5;

public class Overload {

	void Compare(int x,int y) {
		if(x>y) {
		System.out.println(x);
	}
		else {
			System.out.println(y);
		}
	}
	void Compare(char x,char y) {
		if(x>y) {
			System.out.println(x);
		}
		else {
			System.out.println(y);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overload v1=new Overload();
		v1.Compare(2,8);
		v1.Compare('A','c');
		
	
		
	}

}
