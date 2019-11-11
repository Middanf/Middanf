package utils;
import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlDBConexion {
	
	public static Connection getConexion(){ 
		Connection cn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String databaseName = "middanf_database";
			String username = "root";
			String password = "qhkbgCp9t*FkgwV_@gvK";
			String instanceConnectionName = "middanf:us-east1:middanf-db";
			String jdbcUrl = String.format(
				    "jdbc:mysql://google/%s?cloudSqlInstance=%s"
				        + "&socketFactory=com.google.cloud.sql.mysql.SocketFactory&useSSL=false",
				    databaseName,
				    instanceConnectionName);
			
			cn=DriverManager.getConnection(jdbcUrl, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cn;
		
	}
	

}
