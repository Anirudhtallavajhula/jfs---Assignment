package java2;

import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double Si = (principalAmount*time*interestRate)/100;
    	return Si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double Ci = (principalAmount*(Math.pow((1+ interestRate),time)))-principalAmount;
    	return Ci;
    }
}

public class Assignment1Q3 {
	public static void main (String args[]){
		SiCi sici = new SiCi();
		double principalAmount,interestRate;
		int time;
		System.out.print("Enter the principalAmount:");
		try(Scanner sc  = new Scanner(System.in)){;
		principalAmount = sc.nextDouble();
		System.out.print("Enter the interestrate:");
		interestRate = sc.nextDouble();
		System.out.print("Enter the time(In years):");
        time = sc.nextInt();
        
        System.out.println("The simple interest of principalAmount is : "+sici.simpleInterest(principalAmount, time, interestRate));
        
        System.out.println("The compound interest of principalAmount is : "+sici.compoundInterest(principalAmount, time, interestRate));
	}
}
}
