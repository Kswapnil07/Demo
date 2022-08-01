import java.util.Scanner;
public class DaysintoYMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the days");
		int D=sc.nextInt();
		int years=D/365;
		int week=D/7;
		System.out.println(years);
		System.out.println(week);
				
	}

}
