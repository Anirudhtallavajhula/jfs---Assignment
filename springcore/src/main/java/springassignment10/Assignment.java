package springassignment10;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignment {
	 public static void main( String[] args ){
		    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Assignment10.xml");
		    hi c = (hi) Assignment10.getBean("Anirudh");
		    c.hello();
		    context.close(); 
		  }
}