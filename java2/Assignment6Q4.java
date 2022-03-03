package java2;

import java.util.*;

public class Assignment6Q4 {
    int date,month,year;
    
    public Assignment6Q4(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return date+"-"+month+"-"+year;
    }

    public int getYear(){
        return year;
    }
    
    public static void main(String[] args) {
        LinkedList<Assignment6Q4> dob = new LinkedList<>();
        

        dob.add(new Assignment6Q4(12,05,2001));
        dob.add(new Assignment6Q4(16,05,2002));
        dob.add(new Assignment6Q4(20,05,1984));
        dob.add(new Assignment6Q4(25,5,1976));
        dob.add(new Assignment6Q4(18,7,1997));
        dob.add(new Assignment6Q4(26,06,2003));
        dob.add(new Assignment6Q4(18,05,1982));

        for (int i = 0 ; i<dob.size();i++){
            int year = dob.get(i).getYear();
            if (year%400==0 || year%100==0 || year%4==0){
                System.out.println("Your Data of Birth is "+dob.get(i)+" and it was a leap year ");
            }else{
                System.out.println("Your date of birth is "+dob.get(i)+" and it was not a leap year");
            }
            
        }
    }
    
}