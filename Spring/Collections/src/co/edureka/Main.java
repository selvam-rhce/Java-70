package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Databases dbs = (Databases)context.getBean("dbs");
		List<String> dbNames = dbs.getDbNames();
		System.out.println(dbNames);
	}
}
