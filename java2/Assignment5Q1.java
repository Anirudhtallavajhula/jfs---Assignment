package java2;

import java.util.HashSet;
import java.util.Set;
import java.util.*;
class Employees
{
	int empid,empSalary;
	String empName,empDept;
	public Employees(int empid,String empName, int empSalary, String empDept)
	{
		
		this.empid=empid;
		this.empName=empName;
		this.empSalary=empSalary;
		this.empDept=empDept;
	}
	

@Override
	public String toString() {
		return "Employees: [empid=" + empid + ", empSalary=" + empSalary + ", empName=" + empName + ", empDept=" + empDept+ "";
	}
}


public class Assignment5Q1 {
	public static void main(String[] args)
	{
		Employees e1=new Employees(9,"Anirudh",500000,"Analyst");
		
		Set<Employees> employees= new HashSet<>();
		employees.add(e1);
		
		System.out.println(employees);
			
		
	}
}