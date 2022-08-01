package A;

public class Indexposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8,9};
		int value=5;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==value) {
				System.out.println(i);
			}
		}
	}

}
