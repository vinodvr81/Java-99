package co.edureka.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.hibernate.entity.Batch;
import co.edureka.hibernate.entity.Faculty;
import co.edureka.hibernate.utils.HibernateUtils;

public class RelationshipsTest {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Faculty faculty = new Faculty();
		faculty.setFacultyId(9845);
		faculty.setFacultyName("Sunil Joseph");
		
		Batch batch1 = new Batch("Java Certification", faculty);
		Batch batch2 = new Batch("Spring Certification", faculty);
		Batch batch3 = new Batch("React Certification", faculty);
		
		Set<Batch> batches = new HashSet<Batch>();
		batches.add(batch1);
		batches.add(batch2);
		batches.add(batch3);
		
		faculty.setBatches(batches);
		
		session.save(faculty);
		
		System.out.println("-----------------------------------------------------------------\n");
		tx.commit();
		
		session.close();
		sfactory.close();		

	}

}
