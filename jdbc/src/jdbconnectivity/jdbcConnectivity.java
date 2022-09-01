package jdbconnectivity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbcConnectivity {

	static Connection conn;
	static ResultSet studRs;
	
	void displayStudentData()
	{
	try {
		Statement stmt=conn.createStatement();
		studRs=stmt.executeQuery("select*from student");
		while(studRs.next())
		{
			System.out.println(studRs.getInt(1)+" "+studRs.getString("sname")+" "+studRs.getInt(2)+" "+studRs.getInt(3)+" "+studRs.getInt(4));
		}
		
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	
}
	void insertStudentData(int id ,int d,int m,int sid,String n)
	{
		try {
			Statement stmt=conn.createStatement();
			String Query="insert into student values ("+id+" "+d+" "+m+""+sid+" "+n+" ,'"+")";
			//int i=stmt.executeUpdate("insert into student values(15,10,85,45,'dutd')");
			
			int i=stmt.executeUpdate(Query);
			if(i!=0)
				System.out.println("record inserted");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	void updateStudentData()
	{
		try {
			Statement stmt=conn.createStatement();
			int i=stmt.executeUpdate("update student set smarks=90 where sid=1");
			if(i!=0)
				System.out.println("record updated");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	void deletestudentRecord()
	{
		try {
			Statement stmt=conn.createStatement();
			
			int i=stmt.executeUpdate("delete from student where sid=5");
			if(i!=0)
				System.out.println("record deleted");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
//	void displaydepartmentData()
//	{
//	try {
//		Statement stmt=conn.createStatement();
//		studRs=stmt.executeQuery("select*from employee");
//		while(studRs.next())
//		{
//			System.out.println(studRs.getInt(1)+" "+studRs.getString("first_name")+" "+studRs.getInt(2)+" "+studRs.getString("last_name"));
//		}
//		
//	}
//	catch(SQLException p)
//	{
//		p.printStackTrace();
//	}
//	
//}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter id,did,sm,sid,name");
//		int i=sc.nextInt();
//		int d=sc.nextInt();
//		int s=sc.nextInt();
//		int sid=sc.nextInt();
//		String n=sc.next();
//		
		
      conn= DBConnection.getconnection1();
      jdbcConnectivity jdbc=new jdbcConnectivity();
     // jdbc.insertStudentData(i, d, s, sid, n);
     // jdbc.insertStudentData(20, 30, 40, 50, "ivyivc");
      
     // jdbc.updateStudentData();
      
      jdbc.deletestudentRecord();
      
      jdbc.displayStudentData();
     // jdbc.displaydepartmentData();
	}

}
