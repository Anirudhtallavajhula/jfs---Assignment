package assignment3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Assignment3.xml");

        BankAccountcontroller controller = (BankAccountcontroller)context.getBean("controller");

        System.out.println(controller.getBalance(264));
        System.out.println(controller.deposit(264,5000));
        System.out.println("----------------------------");
        System.out.println(controller.withdraw(264,5000));
        System.out.println(controller.getBalance(264));
        
        System.out.println("----------------------------");
        System.out.println(controller.fundTransfer(264,200,5000));
        System.out.println(controller.getBalance(264));
        System.out.println(controller.getBalance(200));
        context.close();
       
    }
}