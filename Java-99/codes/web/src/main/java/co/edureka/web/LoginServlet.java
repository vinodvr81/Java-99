package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static PreparedStatement pst;
	
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_edureka", "root", "root");
			pst = con.prepareStatement("select * from users where username=? and password=?");
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get form data
		String user = request.getParameter("txt_uid");
		String pass = request.getParameter("txt_pwd");
		
		try {
			pst.setString(1, user);
			pst.setString(2, pass);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				RequestDispatcher rd = request.getRequestDispatcher("welcome");
				rd.forward(request, response);
			}else {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				out.println("<p style=\"text-align:center;font-size:18px;color:yellow\">Authentication Failed!!!</p>");
				
				RequestDispatcher rd = request.getRequestDispatcher("login.html");
				rd.include(request, response);
			}
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
