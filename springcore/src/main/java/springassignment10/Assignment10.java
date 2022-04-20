package springassignment10;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

class hi{
	void hello() {
		System.out.println("Hi,Hello");
	}
}
public class Assignment10 implements ApplicationContextAware{
	private static ApplicationContext Context;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		Context = applicationContext;
		
	}
	 public static Object getBean(String beanName){
		 System.out.println(beanName);
		  return Context.getBean(beanName);
		 }
	
}