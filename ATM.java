public class ATM {

    private int pin = 1234;

    private double balance = 0.0;


    public boolean validatePin(int enteredPin) {

        return enteredPin == pin;

    }


    public void deposit(double amount) {

        if (amount > 0) {

            balance += amount;

            System.out.println("Deposited: Rs. " + amount);

        } else {

            System.out.println("Invalid amount!");

        }

    }


    public void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {

            balance -= amount;

            System.out.println("Withdrawn: Rs. " + amount);

        } else {

            System.out.println("Insufficient balance or invalid amount!");

        }

    }


    public void displayBalance() {

        System.out.println("Current Balance: Rs. " + balance);

    }

}

