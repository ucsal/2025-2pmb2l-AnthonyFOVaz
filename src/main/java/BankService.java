public class BankService {
    
    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }
    
    public void processWithdrawal(Withdrawable withdrawable, double amount) {
        withdrawable.withdraw(amount);
    }
}
