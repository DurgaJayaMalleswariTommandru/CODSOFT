import java.util.*;
class BankAccount {
    private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdraw(double amount){
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
class ATM{
    private BankAccount account;
    private Scanner scanner;
    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }
    public void run() {
        while (true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting........");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    private void deposit() {
        System.out.print("Enter amount to deposit:");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Deposit successful. New balance:" + account.getBalance());
    }
    private void checkBalance() {
        System.out.println("Current balance:" + account.getBalance());
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000.0);
        ATM atm = new ATM(account);
        atm.run();
    }
}