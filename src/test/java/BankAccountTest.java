import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testCheckingAccountWithdrawal() {
        CheckingAccount account = new CheckingAccount(100);
        BankService service = new BankService();
        
        service.processWithdrawal(account, 50);
        assertEquals(50, account.getBalance());
    }
    
    @Test
    public void testSavingsAccountCannotWithdraw() {
        SavingsAccount account = new SavingsAccount(100);
        BankService service = new BankService();
        
        // Verificamos que não há método para retirar dinheiro da poupança
        // O código agora nem compila se tentarmos fazer: service.processWithdrawal(account, 50);
        
        // Verificamos que o saldo permanece inalterado
        assertEquals(100, account.getBalance());
    }
    
    @Test
    public void testDeposit() {
        CheckingAccount checkingAccount = new CheckingAccount(100);
        SavingsAccount savingsAccount = new SavingsAccount(100);
        BankService service = new BankService();
        
        service.deposit(checkingAccount, 50);
        service.deposit(savingsAccount, 50);
        
        assertEquals(150, checkingAccount.getBalance());
        assertEquals(150, savingsAccount.getBalance());
    }
}
