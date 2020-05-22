package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session = sfactory.openSession();
		
		session.beginTransaction();
		
		/*
		//  to update a student - approach-1 
	
		Student st = new Student(101,"Sunil Joseph","sunil@edureka.co","9999888877");
		session.update(st);		
		*/
		
		//to update a student - approach-2
		Student st = session.get(Student.class, Integer.valueOf(102));
		if(st != null) {
			System.out.println(st);
			st.setSname("Ajay Sharma"); //becomes a dirty object
		}

		session.getTransaction().commit();
		session.close();
		sfactory.close();
	}

}
