package Assignment2;
import java.util.Scanner;
public class mydate {
int date,month,year;
void data(int d, int m, int y) {
	date=d;
	month=m;
	year=y;
}

void date() {
    if(date>0 && date<31 && month>0 && month<12 && year>0) {
    	
    	System.out.println(date+" "+month+" "+year);
    }
    else {
    	System.out.println("invalid");
    }
}
public String toString()
{
	return( date+" "+month+" "+year);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int date,month,year;
Scanner sc=new Scanner(System.in);
System.out.println("enter date,month,year");
date=sc.nextInt();
month=sc.nextInt();
year=sc.nextInt();
mydate d1=new mydate();
d1.data(date,month,year);
d1.date();
System.out.println();
	}

}
