package assignment4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service("service")
public class BankAccountServiceImpl implements BankAccountService, ApplicationContextAware {
    private  ApplicationContext context;
    public double withdraw(long accountId, double balanceToBeWithdraw) {

        double newBalance=0;
        BankAccountRepositoryImpl acc=(BankAccountRepositoryImpl) context.getBean("bankrepo");
        if(acc.getBalance(accountId)>=balanceToBeWithdraw)
            newBalance = acc.getBalance(accountId)-balanceToBeWithdraw;
        acc.updateBalance(accountId,newBalance);
        return  newBalance;
    }

    public double deposit(long accountId, double balance) {
        BankAccountRepositoryImpl acc=(BankAccountRepositoryImpl) context.getBean("bankrepo");
        double Newbalance = acc.getBalance(accountId)+balance;
        return acc.updateBalance(accountId,Newbalance);
    }

    public double getBalance(long accountId) {
        BankAccountRepositoryImpl balance=(BankAccountRepositoryImpl) context.getBean("bankrepo");
        return balance.getBalance(accountId);
    }

    public boolean fundTransfer(long fromAccount, long toAccount, double amont) {

        BankAccountRepositoryImpl accountepository=(BankAccountRepositoryImpl) context.getBean("bankrepo");
        if(accountepository.getBalance(fromAccount)>=amont){
            double updatedAmt= amont+accountepository.getBalance(toAccount);

            // updating both the accounts
            accountepository.updateBalance(fromAccount,accountepository.getBalance(fromAccount)-amont);
            accountepository.updateBalance(toAccount,updatedAmt);
            return true;
        }
        return false;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=applicationContext;

    }
}