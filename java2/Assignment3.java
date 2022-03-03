package java2;

public class Assignment3 {
	public static void main(String[] args) {
		
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		
		//a. Print the string to console in lowercase
		String str1 = str.toLowerCase();
		System.out.println(str1.toLowerCase());
		
		//b. Print the string to console in uppercase
		String str2 =str.toUpperCase();
		System.out.println(str2.toUpperCase());
		
		//c. Replace all ‘a’ character in the string with $ sign
		String str3 = str.replace('a', '$');
		System.out.println(str3.replace('a','$'));
		
		//d. Check if the original String contains the word “collection”
		
		if(str.contains("collection"))
		{
			System.out.println("Matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
		
		//e. Check if the following String “java string pool refers to collection of strings which are stored in heap memory” matches the original
		String str4 = "java string pool refers to collection of strings which are stored in heap memory";
		
		if(str.equals(str4))
			System.out.println("Equal Strings");
		else
			System.out.println("Not Equal Strings");
		
		//f. If the string does not match check if there is another method which can be used to check if the strings are equal
		
	}
}