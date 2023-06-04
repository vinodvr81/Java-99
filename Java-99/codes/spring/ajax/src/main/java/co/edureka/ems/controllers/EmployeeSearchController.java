package co.edureka.ems.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.dto.Employee;
import co.edureka.ems.services.EmployeeService;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmployeeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService service;
	
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");
		
		service = (EmployeeService)context.getBean("employee-service");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String empno = request.getParameter("eno");
		int eno = Integer.parseInt(empno);
		
		Employee emp = service.searchEmployeeByNo(eno);
		
		if(emp != null) {
			JSONObject empJson = new JSONObject();
			empJson.put("empname", emp.getEmployeeName());
			empJson.put("empsal", emp.getEmployeeSal());
			
			response.setContentType("application/json");
			out.println(empJson);
		}else {
			out.print("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
