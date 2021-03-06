package java2;

import java.util.ArrayList;
import java.util.List;
 class CurrentAccount extends Assignment2Q3 
 {
	    int creditLimit = 5000;
	    public CurrentAccount(String name) 
	    {
	        super(name);
	    }
	    public int withdraw(int amount) 
	    {
	        if (getCash() > amount) 
	        {
	            totalDeposits -= amount;
	            return -(amount);
	        }
	        else if((getCash()+creditLimit)>amount)
	        {
	            this.creditLimit -= amount-totalDeposits;
	            totalDeposits -= amount;
	            return -(amount);
	        }
	        else
	        {
	            return 0;
	        }
	    }
	    public int getCash() 
	    {
	        return (totalDeposits);
	    }
	}
	class SavingsAccount extends Assignment2Q3 
	{
	    int fixedDepositAmount = 50000;

	    public SavingsAccount(String name) 
	    {
	        super(name);
	    }
	    public int getCash() 
	    {
	        return (fixedDepositAmount+totalDeposits);
	    }
	    public int withdraw(int amount) 
	    {
	        if (getCash() > amount)
	        {
	            totalDeposits -= amount;
	            return -(amount);
	        } else {
	            return 0;
	        }
	    }

	}
	public  class Assignment2Q3
	{
	    static ArrayList<Integer> totalCashInBank;
	    private String name;
	    protected int totalDeposits=0;
	    public Assignment2Q3(String name) 
	    {
	        this.name = name;
	    }
	    public int deposit(int amount) 
	    {
	        this.totalDeposits += amount;
	        return amount;
	    }
	    public int withdraw(int amount)
	    {
	        if (totalDeposits > amount)
	        {
	            totalDeposits -= amount;
	            return -amount;
	        } else 
	        {
	            return 0;
	        }
	    }
	    public static int totalCashInBank(ArrayList<Integer> cash)
	    {
	        int total = 0;
	        for(int i =0;i<cash.size();i++)
	        {
	            total += cash.get(i);
	        }
	        return total;
	    }
	    public int getCash()
	    {
	        return totalDeposits;
	    }
	    public static void main(String[] args) 
	    {
	        totalCashInBank = new ArrayList<Integer>();
	        Assignment2Q3 acc1 = new SavingsAccount("acc1");
	        Assignment2Q3 acc2 = new CurrentAccount("acc2");
	        SavingsAccount acc3 = new SavingsAccount("acc3");
	        CurrentAccount acc4 = new CurrentAccount("acc4");
	        totalCashInBank.add(acc1.deposit(3000));
	        totalCashInBank.add(acc2.deposit(50000));
	        totalCashInBank.add(acc3.deposit(75000));
	        totalCashInBank.add(acc4.deposit(1000));
	        totalCashInBank.add(acc3.withdraw(6700));
	        totalCashInBank.add(acc2.withdraw(25000));
	        System.out.println(totalCashInBank((totalCashInBank)));
	        }
	    }