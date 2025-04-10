import java.util.Scanner;

class GradeSystem {
    double average(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeSystem gs = new GradeSystem();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.printf("Average marks: %.2f\n", gs.average(marks));
    }
}
