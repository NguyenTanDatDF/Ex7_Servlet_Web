package dat.conn;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class MySQLConnUtils {
	 public static Connection getMySQLConnection()
	         throws ClassNotFoundException, SQLException {
		 // Note: Change the connection parameters accordingly.
	     String hostName = "sql6.freemysqlhosting.net";
	     String dbName = "sql6447755";
	     String userName = "sql6447755";
	     String password = "4LCXmzgDiD";
	     return getMySQLConnection(hostName, dbName, userName, password);
	 }
	 public static Connection getMySQLConnection(String hostName, String dbName,
	         String userName, String password) throws SQLException,
	         ClassNotFoundException {
	   
	     Class.forName("com.mysql.jdbc.Driver");
	 
	     // URL Connection for MySQL:
	     // Example: 
	     // jdbc:mysql://localhost:3306/simplehr
	     String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
	 
	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }
}
