package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private ArrayList<BankAccount> bankAccounts;

    public Bank(){
        this.bankAccounts = new ArrayList<>();
    }

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount tmp = bankAccounts.get(indexNumber);
        bankAccounts.remove((int) indexNumber);
        return tmp;
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return bankAccounts.contains(bankAccount);
        //throw new UnsupportedOperationException("Method not yet implemented");
    }


}
