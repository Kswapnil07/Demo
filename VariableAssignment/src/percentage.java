import java.util.Scanner;
public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the phy sub marks");
float phy=sc.nextFloat();
System.out.println("enter che marks");
float che=sc.nextFloat();
System.out.println("enter math marks");
float math=sc.nextFloat();

float total=phy+che+math;
float per=(total/300)*100;

System.out.println("percentage of marks:"+per);
	}

}
