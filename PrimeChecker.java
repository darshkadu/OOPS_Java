import java.util.Scanner;

class PrimeChecker {
    boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeChecker primeChecker = new PrimeChecker();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (primeChecker.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
