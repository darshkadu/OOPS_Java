import java.util.Scanner;

class DiscountCalculator {
    double calculateDiscount(double price, double discount) {
        return price - (price * discount / 100);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.print("Enter item price: ₹");
        double price = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        double finalPrice = calculator.calculateDiscount(price, discount);
        System.out.println("Final price after discount: ₹" + finalPrice);
    }
}
