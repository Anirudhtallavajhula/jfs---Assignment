package java2;

import java.util.Scanner;

public class Assignment4Division {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){;
		
		try {
		System.out.println("Enter the Dividend Value: ");
		int Dividend = sc.nextInt();
		System.out.println("Enter the Divisor Value: ");
		int Divisor =sc.nextInt();
		
		int Result = Dividend/Divisor;
		
		System.out.println("Result is "+Result);
	
		}
		catch (ArithmeticException e)
		{
			
			System.out.println("You Entered '0' in Divisor Section");
			
		}
		}
}
}