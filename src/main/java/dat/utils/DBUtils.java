package dat.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dat.beans.User;


public class DBUtils {


public static boolean IsExistEmail(Connection conn, String gmail) throws SQLException
{
	String sql = "SELECT Gmail FROM user where Gmail = ?;";

	PreparedStatement prsm = conn.prepareStatement(sql);
	prsm.setString(1, gmail);
	ResultSet rs = prsm.executeQuery();
    int i = 0 ;
    while(rs.next())
    {
    	i++;
    }
    if(i==0)
    {
    	return false;
    }
    else
    {
    	return true;
    }
    }
}
