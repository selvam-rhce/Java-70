package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Bank bank = (Bank)context.getBean("bank");
		
		bank.deposit();
		bank.deposit("SBIN1000235",25000f);
		bank.withdraw(1500f);
	}
}
