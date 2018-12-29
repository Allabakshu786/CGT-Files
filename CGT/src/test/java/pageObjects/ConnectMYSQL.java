package pageObjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import generalUtilities.ConnectSQL;

public class ConnectMYSQL {
	ResultSet rs;
	ConnectSQL consql;

	public ConnectMYSQL() {
		// TODO Auto-generated constructor stub
		consql = new ConnectSQL("localhost", "3306", "cgt", "root", "admin");
	}

	@Test
	public void secondType() {
		String data = null;
		rs =consql.getResultSet("select * from cgtuser");
		try {
			while (rs.next()) {
				 data = rs.getString(1);
				 System.out.println("Name of  the data: " + data);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Name of  the data: " + data);

	}

	@Test
	public void connectDB() {

		// Load mysql jdbc driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Connected");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgt", "root", "admin");
			System.out.println("Connected to MYSQL DB");
			// Create Statement Object
			Statement stmt = con.createStatement();

			rs = stmt.executeQuery("select * from attar");
			// rs = stmt.executeQuery("select name from attar where name='Johnny' ");
			// System.out.println("Name" + " Age");
			while (rs.next()) {
				String name = rs.getString("name");
				String age = rs.getString("age");

				System.out.println(" Age " + age);

			}
			/*
			 * rs = stmt.executeQuery("select * from attar"); System.out.println("Name" +
			 * " Age"); while (rs.next()) { String name = rs.getString("name"); String age =
			 * rs.getString("age");
			 * 
			 * System.out.print("Name of  the record: " + name); System.out.println(" Age "
			 * + age);
			 * 
			 * }
			 */
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch blo ck
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			// e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
	}

}