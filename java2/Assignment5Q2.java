package java2;

import java.util.*;
public class Assignment5Q2 {
	public static void main(String[] args)
	{
		HashMap<Integer,Double> map=new HashMap<Integer,Double>();
		map.put(6, 0.6);
		map.put(5, 1.5);
		map.put(8, 2.6);
		map.put(2, 3.2);
		map.put(3, 4.3);
		map.put(7, 5.7);
		map.put(1, 6.1);
		map.put(0, 7.5);
		map.put(9, 8.3);
		map.put(4, 9.4);
		
		
		for(Map.Entry<Integer, Double> e: map.entrySet())
			System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
		
	}

}