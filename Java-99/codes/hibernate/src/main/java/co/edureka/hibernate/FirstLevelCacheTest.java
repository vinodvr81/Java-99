package co.edureka.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class FirstLevelCacheTest {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session1 = sfactory.openSession();

		Student st1 = session1.get(Student.class, 101);
		System.out.println(st1);
		
		System.out.println();
		
		Thread.sleep(5000);
		
		Student st2 = session1.get(Student.class, 101);
		System.out.println(st2);
		
		session1.close();
		sfactory.close();		
	}

}
