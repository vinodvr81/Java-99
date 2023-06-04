package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.Customer;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("customer-car-beans.xml");
		
		Customer cust = (Customer)context.getBean("sanjay");
		System.out.println(cust.getCustomerName()+" ows a " + cust.getCar().getModel()+", which costs Rs."+ cust.getCar().getCost());
	}
}
