import java.util.Scanner;

class InterestCalculator {
    double calculateSimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InterestCalculator interestCalculator = new InterestCalculator();

        System.out.print("Enter principal amount: ₹");
        double principal = sc.nextDouble();

        System.out.print("Enter interest rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time period (in years): ");
        int time = sc.nextInt();

        double interest = interestCalculator.calculateSimpleInterest(principal, rate, time);
        System.out.println("Simple Interest: ₹" + interest);
    }
}
