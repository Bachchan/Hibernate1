package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class Connectionn {

	public static Connection createConnection() 
	{
			Connection con=null;
		
		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			String dbUrl="jdbc:mysql://localhost:3306/becm78_db?user=root&password=root&autoReconnect=true&relaxAutoCommit=true";
		    con=DriverManager.getConnection(dbUrl);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return con;
	}
}
