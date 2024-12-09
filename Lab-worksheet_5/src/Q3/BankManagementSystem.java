package Q3;

public class BankManagementSystem {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(1000);

        account.withdraw(300);

        System.out.println("Current Balance: $" + account.getBalance());

        account.withdraw(800);
    }
}
