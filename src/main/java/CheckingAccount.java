public class CheckingAccount extends Account implements Withdrawable {
    
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
}
