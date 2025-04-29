public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount Bank1 = new BankAccount(123456, "Ali", 1000.0f);
        Bank1.display();

    }

}

class BankAccount {
    int accountNumber;
    String holderName;
    float balance;

    BankAccount(int accNo, String Name, float bal) {

        this.accountNumber = accNo;
        this.holderName = Name;
        this.balance = bal;

    }

    void deposit(float amount) {
        amount = amount + amount;
    }

    void display() {
        System.out.println("AccountNumber: " + accountNumber);
        System.out.println("holderName: " + holderName);
        System.out.println("balance: " + balance);

    }

}
