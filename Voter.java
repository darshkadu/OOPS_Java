import java.util.Scanner;

class Voter {
    String name;
    int age;

    Voter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    boolean isEligible() {
        return age >= 18;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        Voter voter = new Voter(name, age);

        if (voter.isEligible()) {
            System.out.println(name + " is eligible to vote ✅");
        } else {
            System.out.println(name + " is not eligible ❌");
        }
    }
}
