package java2;

import java.util.Scanner;

interface SI {

	float calculate(float p, float r, float t);
}
  
class Assignment10Q1 {
    
	public static void main(String args[])
    {
    	
    	System.out.print("Enter the principalAmount:");
		Scanner sc = new Scanner(System.in);
		var p = sc.nextFloat();
		System.out.print("Enter the interestrate:");
		var r = sc.nextFloat();
		System.out.print("Enter the time(In years):");
        var t = sc.nextFloat();
        
        SI si = (float a, float b, float c) -> (p*r*t)/100;
        
        float interest = si.calculate(p, r, t);
        System.out.println(interest);
    }
}