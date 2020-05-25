package co.edureka.app;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Batch;
import co.edureka.models.Faculty;

public class Relationships {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory(); 
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		/*create Faculty Object*/
		Faculty faculty = new Faculty(101,"Sunil Joseph");
		
		/*create batches*/
		Batch batch1 = new Batch(1,"Bigdata 24th May 2020",faculty);
		Batch batch2 = new Batch(2,"Java 30th May 2020",faculty);
		Batch batch3 = new Batch(3,"Java 28th April 2020",faculty);
		
		/*group all batches into a set*/
		Set<Batch> batches = new HashSet<>();
		batches.add(batch1);
		batches.add(batch2);
		batches.add(batch3);
		
		faculty.setBatches(batches);
		
		session.save(faculty);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
