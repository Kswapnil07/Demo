package pratics;
import java.util.Scanner;
public class fibona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0,b=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
for(int i=1;i<=num;i++) {
	System.out.println(a);
	int c=a+b;
	a=b;
	b=c;
}
	}

}
