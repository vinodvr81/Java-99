package co.edureka.spring.core;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.Hospital;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("hospital-beans.xml");
		
		Hospital hosp = (Hospital)context.getBean("apollo");
		
		System.out.println("Hospital Name : " + hosp.getHospitalName());
		System.out.println();
		
		System.out.println("Departments ==> ");
		
		Set<String> depts = hosp.getDepartments(); 
		
		for(String dept : depts ) {
			System.out.println("\t---> " + dept);
		}
	}

}
