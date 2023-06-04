package co.edureka.web;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/life")
public class LifecycleServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
	public void init(ServletConfig config) throws ServletException {
		System.out.println("inside init() method");
	}

	public void destroy() {	}


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("inside service() method");
	}
}
