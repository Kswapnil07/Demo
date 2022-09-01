package jdbconnectivity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableStatementExample {

	
	static Connection conn;
	void functionCall(int id)throws SQLException
	{
		CallableStatement cstmt=conn.prepareCall("{?=call FullName(?)}");
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.setInt(2, id);
		cstmt.execute();
		String s=cstmt.getNString(1);
		System.out.println(s);
	}
	void procedureCall()
	{
//		try {
//			CallableStatement cstmt=conn.prepareCall("{call DeptEmpCount()}");
//			ResultSet rs=cstmt.executeQuery();
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1)+" "+rs.getInt(2));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			CallableStatement cstmt=conn.prepareCall("{call EmployeeData()}");
			ResultSet rs=cstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
//		try {
//			CallableStatement cstmt=conn.prepareCall("{call EmpNameSalary(?,?,?,?)}");
//			//cstmt.setInt(1, 100);
//			cstmt.registerOutParameter(1, Types.VARCHAR);
//			cstmt.registerOutParameter(2, Types.INTEGER);
//			cstmt.registerOutParameter(3, Types.DATE);
//			
//			cstmt.execute();
//			String name=cstmt.getNString(1);
//			double salary=cstmt.getDouble(2);
//			Date date=cstmt.getDate(3);
//			System.out.println(name+" "+salary+" "+date);
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
	
	
	
	
	
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		//conn=DBConnection.getconnection1("oracaltestdb");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the id");
//		int id=sc.nextInt();
		CallableStatementExample cs =new CallableStatementExample();
		//cs.functionCall(id);
		cs.procedureCall();
	}

}
