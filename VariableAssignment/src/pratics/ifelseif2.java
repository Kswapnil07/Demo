	package pratics;
	import java.util.Scanner;
	public class ifelseif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the physics marks");
		int p=sc.nextInt();
		System.out.println("enter the chemistry marks");
		int c=sc.nextInt();
		System.out.println("enter the math marks");
		int m=sc.nextInt();
		int total=p+c+m;
		float per=(100*total)/300;
		System.out.println("percentage in pcm group :" +per+ "%");
		
		if(per>=80.00f) 
		System.out.println("student passed with A+ grade");
		else if(per>=60)
			System.out.println("student passed with A grade");
		else if(per>=50)
			System.out.println("student passed with B grade");
		else if(per>=40)
			System.out.println("student passed with c grade");
		else
			System.out.println("student is failed");

	
    }
	}


