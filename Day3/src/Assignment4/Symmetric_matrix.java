package Assignment4;
import java.util.Scanner;

public class Symmetric_matrix {

	void dislpayArray(int a[][],int r,int c) {
		System.out.println("element of array");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	void symmetricElement(int a[][],int r,int c)
	{
		int b[][]=new int [c][r];
		System.out.println("symmetrical element");
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				 
				b[i][j]=a[j][i];	
				System.out.print(b[i][j]+" ");		
				
			}
			System.out.println();
		}
	int d=0;	
	
	for(int i=0;i<r;i++)
	{
		
		for(int j=0;j<c;j++)
		{
		if(b[i][j]==a[i][j])	{
			d++;
		}
		}
		
		System.out.println();
	}
	if(d==(c*r)) {
		System.out.println("symmetrical");
	}
	else 
		System.out.println("not symmetrical");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the row");
r=sc.nextInt();
System.out.println("enter the col");
c=sc.nextInt();
int arr[][]=new int [r][c];
System.out.println("enter"+(r*c)+"element");
for(int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		
		arr[i][j]=sc.nextInt();
	}
	
}
Symmetric_matrix s1=new Symmetric_matrix();
s1.dislpayArray(arr, r, c);
s1.symmetricElement(arr, r, c);
	}

}
