package java2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	
}
class testcase{
    @Test
    void run() {
        System.out.println("TestCase");
    }
}
public class Assignment7Q1 {
    public static void main(String[] args) {
        testcase t = new testcase();
        t.run();
    }
}