// BankAccount Task day 35
public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        if (accountNumber < 0) return;
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("invalid Balance now system is exiting");
            System.exit(0);
        }
        ;
        this.balance = balance;
    }
    public double deposit(double amount) {
        if (amount < 0) {
            System.out.println("invalid amount now system is exiting");
            System.exit(0);
        }
        return balance += amount;
    }
    public double withdraw(double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("withdraw amount can not be greater than amount");
            System.exit(0);
        }
        return balance -= amount;
    }
    public void checkBalance() {
        System.out.println(balance);
    }
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
class Objects6 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Yusuf", 343, 130000);
        BankAccount account2 = new BankAccount("Mesut", 723479, 20000);
        account1.deposit(10000);
        account2.withdraw(50000);
        account1.checkBalance();
        System.out.println(account1);
        System.out.println(account2);
    }
}
