class BankAccount {
    private String holderName;
    private double balance;

    BankAccount(String holderName) {
        this.holderName = holderName;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void showBalance() {
        System.out.println(holderName + "'s Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Jane");
        acc.deposit(200);
        acc.withdraw(50);
        acc.showBalance();
    }
}
