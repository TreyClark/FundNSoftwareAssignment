package loginwebapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static Connection createConnection() {
		
		Connection connecition = null;
		String url = "jdbc::mysql://http://localhost:8080/users";
		String username = "root";
		String password = "Kingofduhworld1";
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
			connecition = DriverManager.getConnection(url, username, password);
			System.out.println("Printing connection object" +connecition);
			
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return connecition;
	}
}
