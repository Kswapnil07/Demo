package basic;
import java.util.Scanner;
public class d {

	public static void main(String[] args) {
	int num;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the num");
	 num=sc.nextInt();
	 int max=num%10;
//	 while(num!=0) {
//		 int r=num%10;
//		 sum=sum+r;
//		 num=num/10;
//	 }
//	 System.out.println(sum);
//		 
	 
	 
	 
	 while(num!=0) {
		 int r=num%10;
		 if(r>max)
			 max=r;
		 num=num/10;
		 
	 }
	 System.out.println(max);
	 }

	
	
}
