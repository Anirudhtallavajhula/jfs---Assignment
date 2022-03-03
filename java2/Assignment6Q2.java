package java2;

import java.util.HashSet;

public class Assignment6Q2 {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("int");
		hs.add("float");
		hs.add("double");
		hs.add("long");
		hs.add("Array");
		hs.add("List");
		
		System.out.println(hs);
		System.out.println("Original Products: "+hs.size());
		
		
		hs.add("Stack");
		hs.add("Queue");
		hs.add("Interface");
		hs.add("Class");
		
		
		System.out.println(hs);
		System.out.println("With Duplicate Products: "+hs.size());
	}

}