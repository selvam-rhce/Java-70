package co.edureka.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Student;

public class InsertStudents {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
		  System.out.println("enter student name, email, mobile");
		  String name = sc.next();
		  String email = sc.next();
		  String mobile = sc.next();
		  /*create a student object */
		  Student st = new Student(name,email,mobile);
		  /*save the student object with hibernate session*/
		  //session.save(st);
		  Integer sid = (Integer)session.save(st);
		  System.out.println("student id = "+ sid);
		  System.out.print("do you have more students to save[Y/N]: ");
		  req = sc.next();
		}
		
		System.out.println("-------------------------------");
		tx.commit();
		sc.close();
		
		session.close();
		sf.close();
	}
}
