package java2;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment8Q4 {
    public static void main(String[] args) {
        ArrayList<String> employeeList = new ArrayList<String> (Arrays.asList("Anirudh","Rohit", "Sachin", "kohli"));
        employeeList.removeIf(s -> ((s.length())%2 != 0));
        System.out.println(employeeList);
    }
}