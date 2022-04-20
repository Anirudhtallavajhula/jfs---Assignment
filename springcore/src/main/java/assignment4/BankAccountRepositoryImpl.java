package assignment4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository("bankrepo")
public class BankAccountRepositoryImpl implements BankAccountRepository {

    private BankAccount bankAccount1;
    private BankAccount bankAccount2;

    public BankAccount getBankAccount1() {
		return bankAccount1;
	}

    @Autowired
	public void setBankAccount1(BankAccount bankAccount) {
		this.bankAccount1 = bankAccount;
	}


	public BankAccount getBankAccount2() {
		return bankAccount2;
	}

	@Autowired
	public void setBankAccount2(BankAccount bankAccount2) {
		this.bankAccount2 = bankAccount2;
	}



  
    public double getBalance(long accountId) {

        if(this.bankAccount1.getAccountId()==accountId){
           return bankAccount1.getAccountBalance();
        }
        else{
           return  bankAccount2.getAccountBalance();
        }

    }

    public double updateBalance(long accountId, double newBalance) {

        double updatedBal=0;
         if(this.bankAccount1.getAccountId()==accountId){
             updatedBal = newBalance;
             bankAccount1.setAccountBalance(updatedBal);
         }
         else{
             updatedBal = newBalance;
             bankAccount2.setAccountBalance(updatedBal);
         }

        return updatedBal;
    }
}