package com.springcore.demospring;



import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Collection;

class Assignment implements InitializingBean,DisposableBean {
		int Questionid;
		String Question;
		Collection<String> answers;
	
		public void init() throws Exception
	    {
	        System.out.println( "Bean Assignment has been instantiated ");
	    }
		

		public void destroy() throws Exception
	    {
	        System.out.println(
	            "Container has been closed and I'm the destroy() method");
	    }
		
		Assignment (int questionid, String question, Collection<String> answers) {
			Questionid = questionid;
			Question = question;
			this.answers = answers;
		}
		

		void Displayanswer(){
		System.out.println(answers);
		}


		@Override
		public String toString() {
			return "Assignment [Questionid=" + Questionid + ", Question=" + Question + ", answers=" + answers + "]";
		}


		public void afterPropertiesSet() throws Exception {
			 System.out.println(
			            "Bean Coustmer has been instantiated and I'm the init() method");
			    }

}
public class Assignment9{
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Assignment9.xml");	      
		
	    Assignment qList= (Assignment) context.getBean("q2List");   
	    System.out.println("\nList Injection\n"+qList);
	    qList.Displayanswer(); 
	   
	    Assignment qset= (Assignment) context.getBean("q2Set");  
	    System.out.println("\nSet Injection\n"+qset);
	    qset.Displayanswer(); 
	    context.close();
	}

}