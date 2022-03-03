package java2;
import java.util.*;
public class Assignment1Q1{
	public static void main(String[] args) {
		try(Scanner input = new Scanner(System.in)){;
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		int temp=0;
		int r=0;
		
		int n=num;
		while(n>0)
		{
			r=n%10;
			temp=temp+(r*r*r);
			n=n/10;
		}
		if(num==temp)
		{
			System.out.println(num+ " is an Armstrong Number");
		}
		else
		{
			System.out.println(num+ " is NOT an Armstrong Number");
		}
	}
}
}