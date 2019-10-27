package utils;
import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlDBConexion {
	
	public static Connection getConexion(){ 
		Connection cn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String connectionURL = "jdbc:mysql://localhost:3306/lms?"
					+ "user=root&password=mysql";
					//+ "user=root&password=";
			cn=DriverManager.getConnection(connectionURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cn;
		
	}
	

}
