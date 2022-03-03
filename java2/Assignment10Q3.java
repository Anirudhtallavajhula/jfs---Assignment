package java2;

import java.util.List;
import java.util.stream.Collectors;

public class Assignment10Q3 {

	public static void main(String[] args) {
		
		
		String Sen = "A quick brown fox jumps over the lazy dog";
		
		Sen.lines().forEach(System.out::println);
		List<String> list = Sen.lines().collect(Collectors.toList());
		System.out.println(list);
	}

}