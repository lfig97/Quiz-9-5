package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Transactable,Worker{
    private BankAccount bankAccount;
    private Double numberOfHours;
    private Double hourlyWage;

    public Employee(BankAccount bankAccount){
        this.bankAccount = bankAccount;
        hourlyWage = 35.0;
        numberOfHours = 0.0;
    }

    public Employee() {
        bankAccount = new BankAccount();
        hourlyWage = 35.0;
        numberOfHours = 0.0;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }


    @Override
    public void deposit(Double amountToIncreaseBy) {
        bankAccount.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bankAccount.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.numberOfHours += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return numberOfHours;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return numberOfHours*hourlyWage;
    }

    public Double getNumberOfHours() {
        return numberOfHours;
    }
}
