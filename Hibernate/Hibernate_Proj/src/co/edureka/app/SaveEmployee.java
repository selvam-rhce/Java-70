package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Employee;

public class SaveEmployee {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee(101,"Sunil Joseph", 25000.5f);
		
		session.save(emp);
		
		System.out.println("-------------------------------");
		tx.commit();
		
		session.close();
		sfactory.close();		
	}
}
