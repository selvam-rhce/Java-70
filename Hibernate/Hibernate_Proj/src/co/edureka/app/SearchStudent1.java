package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Student;

public class SearchStudent1 {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		Student st = new Student();
		System.out.println(st); //calls toString()
		
		try {
		  session.load(st, Integer.valueOf(1015));
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		System.out.println(st);
		
		session.close();
		sfactory.close();
	}
}
