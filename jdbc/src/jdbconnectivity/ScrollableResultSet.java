package jdbconnectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ScrollableResultSet {

	static Connection conn;
	static ResultSet rs;
	static PreparedStatement stmt;
	
	
	void displayStudentData() throws SQLException
	{
	stmt=conn.prepareStatement("select*from student", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	}
	
	void forwardTraverse()
	{
		try {
			rs.beforeFirst();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getInt(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void backwardTraverse()
	{
		try {
			rs.afterLast();
			while(rs.previous())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void traverseSpecificRow()
	{
		try {
			rs.absolute(4);
			while(rs.next());
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void firstLastRow()
	{
		try {
			rs.first();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
			
			rs.last();
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void updatedata(int id)
	{
		try {
			while(rs.next())
			{
			if(rs.getInt(1)==id)	
			{
				rs.updateInt(3, 90);
				rs.updateRow();
			}
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void insertData()
	{
		try {
		rs.moveToInsertRow();
		rs.updateInt(1, 35);
		rs.updateString(1, "raj");
	}
		catch(SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void delete()
	{
		try {
			rs.absolute(5);
			rs.deleteRow();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

	//	conn=DBConnection.getconnection1("oraclestudentdb");
		ScrollableResultSet sr=new ScrollableResultSet();
		sr.displayStudentData();
	//	sr.backwardTraverse();
		sr.forwardTraverse();
//		sr.firstLastRow();
//		sr.updatedata(1);
//		sr.insertData();
//		sr.delete();
	}

}
