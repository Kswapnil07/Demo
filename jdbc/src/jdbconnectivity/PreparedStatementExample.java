package jdbconnectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementExample {

	static Connection conn;

	
	
//	void showTable()
//	{
//		try {
//			PreparedStatement pstmt=conn.prepareStatement("show table");
//			ResultSet rs=pstmt.executeQuery();
//			while(rs.next())
//			{
//				System.out.println(rs.getString(1));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//	}
	
	void displayData()
	{
		try {
			PreparedStatement pstmt=conn.prepareStatement("select*from student");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt(1);
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString("sname"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
//	void insertStudentData(int id,String name,int marks,int deptid,int spid)
//	
//	{
//		try {
//			PreparedStatement pstmt=conn.prepareStatement("insert into student values(?,?,?,?,?)");
//			pstmt.setInt(1, id);
//			pstmt.setString(2, name);
//			pstmt.setInt(3, marks);
//			pstmt.setInt(4, deptid);
//			pstmt.setInt(5, spid);
//			
//			int i=pstmt.executeUpdate();
//			if(i!=0)
//				System.out.println("record inserted");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	void updateData(int marks,int id)
//	{
//		try {
//			PreparedStatement pstmt=conn.prepareStatement("update student set smarks=?,where sid=?");
//			pstmt.setInt(1, marks);
//			pstmt.setInt(2, id);
//			
//			int i=pstmt.executeUpdate();
//			if(i!=0)
//				System.out.println("record updated");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
//	}
//	void deleteData(int id)
//	{
//		try {
//			PreparedStatement pstmt=conn.prepareStatement("delete from student where sid=1");
//			pstmt.setInt(1, id);
//			int r=pstmt.executeUpdate();
//			if(r!=0)
//				System.out.println("record delete");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the database name:");	
		//conn=DBConnection.getconnection1(database);
		
		PreparedStatementExample pse=new PreparedStatementExample();
		pse.displayData();
//		System.out.println("Enter the student info(id,name,marks,dept_id,sport_id);");
//		int i=sc.nextInt();
//		String n=sc.next();
//		int m=sc.nextInt();
//		int d=sc.nextInt();
//		int s=sc.nextInt();
//		pse.insertStudentData(i, n, m, d, s);
		//System.out.println(" ---------------------");
	//	pse.displayData();
		//pse.showTable();
		//pse.deleteData(0);
		}
	}


