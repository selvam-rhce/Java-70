package co.edureka.app;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Student;

public class HQLTest {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		/*
		//String hql = "from co.edureka.models.Student";
		//String hql = "from co.edureka.models.Student where sname='Sachin'";				
		TypedQuery<Student> query = session.createQuery(hql);
		*/
		
		/*
		String hql = "from co.edureka.models.Student where studid between ? and ?"; //positional parameters
		TypedQuery<Student> query = session.createQuery(hql);
		query.setParameter(0, Integer.valueOf(101));
		query.setParameter(1, Integer.valueOf(105));
		*/
		
		String hql = "from co.edureka.models.Student where studid between :minsid and :abc"; //named parameters
		TypedQuery<Student> query = session.createQuery(hql);
		query.setParameter("minsid", Integer.valueOf(105));
		query.setParameter("abc", Integer.valueOf(1050));
		
		List<Student> students = query.getResultList();
		//iterating on List
		for(Student st : students) {
			System.out.println(st);
			Thread.sleep(1000);
		}
		
		System.out.println("------------ to update a student using HQL -----------------");
		session.beginTransaction();
		hql = "update co.edureka.models.Student set sname='Sunil' where studid=101";
		query = session.createQuery(hql);
		int no = query.executeUpdate();
		System.out.println("No of records affected = "+no);
		
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
