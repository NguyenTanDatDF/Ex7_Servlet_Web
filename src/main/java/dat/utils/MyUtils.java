package dat.utils;

import java.sql.Connection;

import javax.servlet.ServletRequest;

public class MyUtils {
 public static final String ATT_NAME_CONNECTION = "ATTRIBUTE_FOR_CONNECTION";
 public static final String ATT_NAME_USER = "ATTRIBUTE_FOR_STORE_USER_NAME_IN_COOKE";
 public static Connection getStoredConnection(ServletRequest request)
 {
	 Connection conn = (Connection) request.getAttribute(ATT_NAME_CONNECTION);
	 return conn;
 }
 public static void storeConnection(ServletRequest request, Connection conn) {
		request.setAttribute(ATT_NAME_CONNECTION, conn);
	}
}
