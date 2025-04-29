public class BankAccountEncaps {
    public static void main(String[] args) {
        BankAccount BankAccount1 = new BankAccount("12343", 1000.08);
        BankAccount1.displayInfo();
        System.out.printf(" after depositing Balance ");
        BankAccount1.deposit( 500.6);
        BankAccount1.displayInfo();
        System.out.println("after withdrawing amount");
        BankAccount1.withdraw(16000);
        BankAccount1.displayInfo();

    }

}

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount() {
        this.accountNumber = "unknown";
        this.balance = 0.0;

    }

    BankAccount(String a, double b) {
        this.accountNumber = a;
        this.balance = b;
    }

    void deposit(double amount) {
        this.balance += amount;
        return;

    }

    void withdraw(double amount) {
        this.balance -= amount;
        if (amount > balance) {
            System.out.println(" you have insufficent balance");
        }
        return;
    }

    String getNumber() {
        return this.accountNumber;
    }

    double getBalance() {
        return this.balance;
    }

    void displayInfo() {
        System.out.println(" AccountNumber " + accountNumber);
        System.out.println("balance " + balance);
    }

}
