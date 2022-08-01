package arraysinjava;

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]={10,20,30,40,50,60,70}; //Literals
		
		
		System.out.println("Elements of array are: ");
		
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}*/
		
		
	//advance for loop/for each loop
		for(int i:arr) //i=arr[0]
		{
			System.out.println(i);
		}
		
		/*int size=6;
		int a[]= new int[size];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter "+ size+ " elements:");
		
		for(int i=0;i<size;i++)//i=0
		{
			a[i]=sc.nextInt();//a[0]=100  a[1]=200  a[2]=300 a[3]=400   a[4]=500  a[5]=600
		}
		
		int sum=0;
       System.out.println("Elements of array are: ");
		
		for(int i=0;i<size;i++)
		{
			if(a[i]%2==0)  //even numbers
			System.out.print(a[i]+" ");
			sum=sum+a[i];
		}
		
		System.out.println("Addition is: "+sum);
		*/
		

	}

}
