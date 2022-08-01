package com.basic;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=4,i=2;
int mid=num/2;
while(i<=num)
{
	if (num%i==0)
	{
		break;
		
	}
	i++;
}
if(i>mid)
	System.out.println("primr number");

	else
		System.out.println("not prime");
}
}
