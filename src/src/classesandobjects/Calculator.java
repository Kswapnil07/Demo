package classesandobjects;

import java.util.Scanner;

public class Calculator {
	
	int a=10,b=20; //accessible throughout the class
	
	void input(int a1,int b1) //a1=20 b1=30
	{
		a=a1;
		b=b1;
	}
	
	void add() //(parameters)
	{
		//int a=10,b=20;//local variables
		/*Scanner sc= new Scanner();
		a=sc.nextInt();*/
	//a=100;  // static programming
	//b=200;
		System.out.println("Addition is: "+(a+b));	
	}
	
	void substract()
	{
		//int a=20,b=10;
		System.out.println("substraction is: "+(a-b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // set value 3 ways:
	// 1. assign value by reference
	//2. by method
	// 3. by constructor
		
		Calculator c1= new Calculator(); 
		Calculator c2= new Calculator(); //a,b
		
		c1.input(20, 30); //application 
		c1.add();
		//c1.input(200, 100);
		//c1.substract();
		
		c2.input(100, 50);
		/*c2.a=100;  //reference 
		c2.b=300;*/
		c2.add();
	}

}
