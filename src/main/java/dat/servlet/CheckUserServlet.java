package dat.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dat.beans.User;
import dat.conn.MySQLConnUtils;
import dat.utils.DBUtils;
@WebServlet("/CheckUser")
public class CheckUserServlet extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Connection conn;
	String errorString = null;
	boolean rs = true;
	try {
		conn = MySQLConnUtils.getMySQLConnection("sql6.freemysqlhosting.net","sql6447755","sql6447755","4LCXmzgDiD");
		rs = DBUtils.IsExistEmail(conn,req.getParameter("email"));
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		errorString = e.getMessage();
	}

	
	if(rs==false)
	{
		String firstName = req.getParameter("firstName");
	    String lastName = req.getParameter("lastName");
	    String email = req.getParameter("email");
	    User user = new User();
	    user.setGmail(email);
	    user.setFirstname(firstName);
	    user.setLastname(lastName);
	    req.setAttribute("user", user);
		req.setAttribute("errorString", errorString);
		req.getRequestDispatcher("thanks.jsp").forward(req, resp);
	}
	else
	{
		req.setAttribute("errorString", errorString);
		String existString = "This email was used by some one please try by other email, thanks!";
		req.setAttribute("existString", existString);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
	
}
}
