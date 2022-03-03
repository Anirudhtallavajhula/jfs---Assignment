package java2;

import java.util.TreeMap;
public class Assignment6Q1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 967584727, "Anirudh");
		contact.put((long) 987635271, "charan");
		contact.put((long) 976894522, "chaitanya");
		contact.put((long) 978123456, "raj pavan");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}