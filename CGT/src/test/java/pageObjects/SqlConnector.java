package pageObjects;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
public class SqlConnector {
	
	
/*	public void connectionDB() {
		
	}*/
	
	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        String dbUrl = "jdbc:mysql://localhost:3306/cgt";					

		//Database Username		
		String username = "root";	
        
		//Database Password		
		String password = "admin";				

		//Query to Execute		
		String query = "select *  from students;";	
        
 	    //Load mysql jdbc driver		
   	    Class.forName("com.mysql.jdbc.Driver");			
   
   	    
   	
		// Connection
		// con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","12345");
		// Connection
		// con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/world","root","12345");
		// here sonoo is database name, root is username and password
		// Statement stmt=con.createStatement();
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	   Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);							
 
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String id = rs.getString(1);								        
	        		String name = rs.getString(2);					                               
	        		String age = rs.getString(2);					                               
	        		String education = rs.getString(2);					                               
                    String mobile = rs.getString(2);					                               
                    System. out.println(id+name+age+education+mobile);		
            }		
			 // closing DB Connection		
			con.close();			
}

}
