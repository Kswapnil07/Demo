package Assignment3;
import java.util.Scanner;
public class abcdPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc=new Scanner(System.in);
System.out.println("enter char");
int r=sc.nextInt();
for(int i=r;i>=1;i--) {
    char c='A';
	for(int j=i;j>=1;j--) {
		System.out.print(c);
				c++;
			}
System.out.println();
}
for(int i=1;i<=r;i++) {
    char b='A';
    for(int j=1;j<=i;j++) {
	System.out.print(b);
	b++;
}
System.out.println();
}
	}
}


	


