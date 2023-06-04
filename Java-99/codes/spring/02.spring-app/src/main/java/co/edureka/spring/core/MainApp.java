package co.edureka.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.User;

public class MainApp {

	public static void main(String[] args) {
		//-- initializing spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("user-beans.xml");
		System.out.println();
		System.out.println("--------------- spring container initialized -----------------\n");
		
		User usr1 = (User) context.getBean("user1");
		System.out.println(usr1);
		System.out.println("--------------------------------------------------------------\n");
		
		User usr2 = (User) context.getBean("user1");
		System.out.println(usr2);
		System.out.println("--------------------------------------------------------------\n");
		
		User usr3 = context.getBean("user1", User.class);
		System.out.println(usr3);
		System.out.println("--------------------------------------------------------------\n");		
		
		User usr4 = (User)context.getBean("user2");
		System.out.println(usr4);
	}

}
