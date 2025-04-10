import java.util.Scanner;
import java.time.LocalDate;

class AgeCalculator {
    int birthYear;

    void setBirthYear(int year) {
        birthYear = year;
    }

    int calculateAge() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AgeCalculator ac = new AgeCalculator();

        System.out.print("Enter your birth year: ");
        int year = sc.nextInt();

        ac.setBirthYear(year);
        System.out.println("Your age is: " + ac.calculateAge());
    }
}
