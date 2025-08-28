import br.com.mariojp.solid.lspaccounts.BankService;
import br.com.mariojp.solid.lspaccounts.CheckingAccount;
import br.com.mariojp.solid.lspaccounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        
        CheckingAccount checkingAccount = new CheckingAccount(100);
        SavingsAccount savingsAccount = new SavingsAccount(100);
        
        System.out.println("Saldo inicial conta corrente: " + checkingAccount.getBalance());
        System.out.println("Saldo inicial poupança: " + savingsAccount.getBalance());
        
        // Depósito em ambas as contas
        bankService.deposit(checkingAccount, 50);
        bankService.deposit(savingsAccount, 50);
        
        System.out.println("Após depósito - conta corrente: " + checkingAccount.getBalance());
        System.out.println("Após depósito - poupança: " + savingsAccount.getBalance());
        
        // Saque apenas da conta corrente (que implementa Withdrawable)
        bankService.processWithdrawal(checkingAccount, 75);
        
        // Não tenta realizar saque da poupança (que não implementa Withdrawable)
        
        System.out.println("Após saque - conta corrente: " + checkingAccount.getBalance());
        System.out.println("Após saque - poupança (não modificada): " + savingsAccount.getBalance());
    }
}