package jdbconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Assigment {

	static String driver ="com.mysql.cj.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/model";
	
	
	static String username="root";
	static String password="Root";
	static Connection co;
	
	static  Connection getconnection1()
	{
		try {
			Class.forName(driver);
		System.out.println("Driver loaded");
		co=DriverManager.getConnection(url,username,password);
		System.out.println("connection successful");		}
		catch(ClassNotFoundException e) 
		{
			e.printStackTrace();
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return co;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
