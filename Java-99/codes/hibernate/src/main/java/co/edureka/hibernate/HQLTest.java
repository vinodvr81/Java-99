package co.edureka.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import co.edureka.hibernate.entity.Student;
import co.edureka.hibernate.utils.HibernateUtils;

public class HQLTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory(); 
		Session session = sfactory.openSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName = 'Babu'";
		//String hql = "from co.edureka.hibernate.entity.Student where studentName LIKE 'S%'";
		//String hql = "from co.edureka.hibernate.entity.Student where studentId IN (101,205,108,110,204,103)";
		Query<Student> q = session.createQuery(hql, Student.class);
		List<Student> students = q.getResultList();
		displayStudents(students);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between ?1 and ?2"; //positional parameters
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter(1, 101);
		q.setParameter(2, 105);
		List<Student> students = q.getResultList();
		displayStudents(students);
		*/
		
		/*
		String hql = "from co.edureka.hibernate.entity.Student where studentId between :minsid and :maxsid"; //named parameters
		Query<Student> q = session.createQuery(hql, Student.class);
		q.setParameter("minsid", 101);
		q.setParameter("maxsid", 105);
		List<Student> students = q.getResultList();
		displayStudents(students);				
		*/
		
		session.beginTransaction();
		
		String hql = "update co.edureka.hibernate.entity.Student set studentName = 'Amith Joshi' where studentId=109";
		Query q = session.createQuery(hql);
		int studentsUpdated = q.executeUpdate();
		System.out.println("students updated = " + studentsUpdated);
		
		session.getTransaction().commit();
		session.close();
		sfactory.close();
	}

	private static void displayStudents(List<Student> students) {
		for(Student st : students) {
			System.out.println(st);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
		
	}
}
