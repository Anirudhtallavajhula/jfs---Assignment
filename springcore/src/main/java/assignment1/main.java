package assignment1;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Assignment1.xml");
		customer c1 = (customer) context.getBean("customer");
		System.out.println(c1);
		context.close();
	}

}