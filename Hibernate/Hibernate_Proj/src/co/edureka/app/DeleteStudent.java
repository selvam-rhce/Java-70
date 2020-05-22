package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		session.beginTransaction();
		
		/*
		//  to delete a student - approach-1 
	
		Student st = new Student(101,"Sunil Joseph","sunil@edureka.co","9999888877");
		session.delete(st);		
		*/
		
		//to delete a student - approach-2
		Student st = session.get(Student.class, Integer.valueOf(110));
		if(st != null) {
			System.out.println(st);
			session.delete(st);
		}
		else {
			System.out.println("No matching student found!");
		}
		
		session.getTransaction().commit();
		
		session.close();
		sfactory.close();
	}
}
