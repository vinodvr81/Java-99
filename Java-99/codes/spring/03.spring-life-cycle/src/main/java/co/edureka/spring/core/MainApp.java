package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		//-- initializing spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println();
		System.out.println("--------------- spring container initialized -----------------\n");
		System.out.println("--------------- closing spring container ---------------------\n");
		
		((ConfigurableApplicationContext)context).close();
	}

}
