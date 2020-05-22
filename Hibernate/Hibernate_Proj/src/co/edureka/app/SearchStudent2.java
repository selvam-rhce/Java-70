package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Student;

public class SearchStudent2 {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		Student st = session.get(Student.class, Integer.valueOf(1015));
		if(st != null)
		  System.out.println(st);
		else
		  System.out.println("No matching student found!");
		
		session.close();
		sfactory.close();
	}

}
