package aA;

public class EvenAndOddSeparate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,5,6,4,8,9,7,10};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);

			}
		}

		System.out.println("odd num");
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 != 0) {
				System.out.println(a[j]);

			}
		}

	}

}

