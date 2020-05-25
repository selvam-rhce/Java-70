package co.edureka.app;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Batch;
import co.edureka.models.Faculty;

public class Relationships1 {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Faculty faculty = session.get(Faculty.class, Integer.valueOf(101));
		
		System.out.println("Faculty:  "+ faculty.getFacid()+" | "+faculty.getFacname());
		System.out.println("Batches of "+ faculty.getFacname());
		
		Set<Batch> batches = faculty.getBatches();
		
		for(Batch batch : batches) {
			System.out.println(batch.getBatchid()+" | "+batch.getCourse());
		}
		
		session.close();
		sf.close();
	}

}
