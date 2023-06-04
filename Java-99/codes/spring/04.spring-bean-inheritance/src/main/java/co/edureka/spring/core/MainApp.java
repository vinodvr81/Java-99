package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.User;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		
		User user1 = (User)context.getBean("user1");
		System.out.println(user1);
		
		System.out.println();
		
		User user2 = (User)context.getBean("user2");
		System.out.println(user2);		
	}
}
