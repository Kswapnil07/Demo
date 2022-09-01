package jdbconnectivity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class Vehicle {

	static Connection conn;

	// 1. Create a stored procedure to get the full name of customer whose cust_id
	// is provided as input.
	void procedureCall() {
		try {
			CallableStatement stmt = conn.prepareCall("{call full_name(12,?,?)}");
			stmt.registerOutParameter(1, Types.VARCHAR);
			stmt.registerOutParameter(2, Types.VARCHAR);
			stmt.execute();
	 
			String s = stmt.getNString(1);
			String i = stmt.getNString(2);
			System.out.println(s + " " + i);

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

//	2.	WAQ to get the number of complaints registered for model activa.

	void displayData() {
		try {
			PreparedStatement pstmt = conn.prepareStatement(
					"select count(purchase_id) from purchase where model_id=(select model_id from model where model_name like 'activa') and rating_id=(select rating_id from feedback_rating where rating like 'complaint');  ");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	// 5. Update ratings given by Mr Vaibhav from good to excellent.
	void updateData() {
		try {
			PreparedStatement stmt = conn.prepareStatement(
					"update purchase set rating_id=(select rating_id from feedback_rating where rating like 'excellent') where cust_id=(select cust_id from customer where first_name like 'Ajay'); ");

			int i = stmt.executeUpdate();
			if (i != 0)

				System.out.println("Record Updated");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

//	reduce cost by 10% if rating is bad

	void reduce() {
		try {
			PreparedStatement stmt = conn.prepareStatement(
					"update model set cost=(cost-(cost*0.10)) where model_id =(select model_id from purchase where rating_id=(select rating_id from feedback_rating where rating like 'bad'));");

			int i = stmt.executeUpdate();
			if (i != 0)

				System.out.println("Record reduce");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

//	4.	Delete all complaint records from purchase. 
	void delete() {
		try {
			PreparedStatement pstmt = conn.prepareStatement(
					"delete from purchase where rating_id=(select rating_id from feedback_rating where rating like 'good')");

			int i = pstmt.executeUpdate();
			if (i != 0)
				System.out.println("Record Deleted");

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

//	3.	WAQ to get all customer names who haven’t given ratings yet. 

	void rating() {
		try {
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery(
					"select first_name from customer where cust_id in (select cust_id from purchase where rating_id is null)");

			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
			System.out.println("rating done");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		conn = DBConnection.getconnection1();
		Vehicle v = new Vehicle();
		// v.procedureCall();
		// v.updateData();
		// v.displayData();
		// v.reduce();
      //	 v.delete();
		// v.rating();
	}

}
