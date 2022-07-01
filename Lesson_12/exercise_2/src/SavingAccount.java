public class SavingAccount extends BankAccount{
    protected double interestRate;

    SavingAccount(String number, Long balance, double interestRate){
        super(number, balance);
        this.interestRate = interestRate;
    }
}
