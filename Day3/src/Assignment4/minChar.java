package Assignment4;
import java.util.Arrays;
import java.util.Scanner;
public class minChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of char");
		int size=sc.nextInt();
		
		System.out.println("enter array element");
		char a[]=new char [size];
		for(int i=0;i<size;i++) {
			a[i]=sc.next().charAt(0);
		}
		
		Arrays.sort(a);
		System.out.println( "char order:"  +Arrays.toString(a));
		System.out.println("min char:" +a[0]);
	}

}
