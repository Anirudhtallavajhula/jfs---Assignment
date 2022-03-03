package java2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment8Q5 {
    public static String processWords(List<String> list) {
        StringBuilder result = new StringBuilder("");
        for(String s :list) {
            StringBuilder sb = new StringBuilder(s);
            result.append(sb.charAt(0));
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anirudh", "Rohit", "Sachin", "Kohli", "Bumrah", "Shami");
            Consumer<String> Result = (input) -> {System.out.println(processWords(list));};
            Result.accept("Execute");
    }
}