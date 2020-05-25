package co.edureka.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.configs.HibernateUtils;
import co.edureka.models.Student;

public class FirstLevelCacheTest {
	
	public static void main(String[] args) {
		checkFirstLevelCache();
	}
	
	public static void checkFirstLevelCache() {
		SessionFactory sfactory = HibernateUtils.getSessionFactory();
		Session session1 = sfactory.openSession();
		
		Student st1 = session1.get(Student.class, Integer.valueOf(101));
		System.out.println(st1);
		System.out.println("--------------------------------");
		
		Student st2 = session1.get(Student.class, Integer.valueOf(101));
		System.out.println(st2);		
		session1.close();
		sfactory.close();
	}

}
