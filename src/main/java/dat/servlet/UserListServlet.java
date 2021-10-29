//package dat.servlet;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import dat.beans.User;
//import dat.conn.MySQLConnUtils;
//import dat.utils.DBUtils;
//import dat.utils.MyUtils;
//@WebServlet("/ProductList")
//public class UserListServlet extends HttpServlet{
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Connection conn;
//		String errorString = null;
//		List<User> list = null;
//		try {
//			conn = MySQLConnUtils.getMySQLConnection("localhost","testdatabase","root","1234");
//			list = DBUtils.ListUser(conn);
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//			errorString = e.getMessage();
//		}
//
//		
//		req.setAttribute("listUser", list);
//		req.setAttribute("errorString", errorString);
//		req.getRequestDispatcher("index.jsp").forward(req, resp);
//	}
//
//}
