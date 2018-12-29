package generalUtilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import java.sql.ResultSet;

public class ConnectSQL {
	ResultSet rset;
	Connection connect;
	Statement stmt;
	/*String hostname = "localhost";
	String portnumber = "3306";
	String database = "cgt";*/
	String dbUrl;
	/*String username = "root";
	String password = "admin";*/
	String data;

	public ConnectSQL(String hostname, String portnumber, String database, String username, String password) {
		// TODO Auto-generated constructor stub
		/*this.hostname = hostname;
		this.portnumber = portnumber;
		this.database = database;
		this.username = username;
		this.password = password;*/
		try {
			Class.forName("com.mysql.jdbc.Driver");
			dbUrl = "jdbc:mysql://" + hostname + ":" + portnumber + "/" + database;
			connect = DriverManager.getConnection(dbUrl, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public ResultSet getResultSet(String Query) {
		try {
			stmt = connect.createStatement();
			rset = stmt.executeQuery(Query);
			/*while (rs.next()) {
				data = rs.getString(1);
			}*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rset;

	}
}
