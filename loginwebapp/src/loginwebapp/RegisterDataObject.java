package loginwebapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDataObject {
	
	public String registerUser(Bean bean){
		
		String userName = bean.getUserName();
		String password = bean.getPassword();
		String securityq = bean.getSecurityQ();
		String securitya = bean.getSecurityA();
		
		Connection con = null;
		PreparedStatement preparedStatement = null;
		
		try{
			
			con = DatabaseConnection.createConnection();
			String query = "insert into users(username,password,securityquestion,answer) values (?,?,?,?)";
			
			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			preparedStatement.setString(3, securityq);
			preparedStatement.setString(4, securitya);
			
			int i= preparedStatement.executeUpdate();
			
			if (i!=0)  //Just to ensure data has been inserted into the database
				 return "SUCCESS"; 
		}
			catch(SQLException e){
				 e.printStackTrace();
			}
				 
			return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
	 }

}
