class Student1 {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void showGrade() {
        if (marks >= 90) {
            System.out.println(name + ": A");
        } else if (marks >= 75) {
            System.out.println(name + ": B");
        } else if (marks >= 60) {
            System.out.println(name + ": C");
        } else {
            System.out.println(name + ": F");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Neha", 82);
        s.showGrade();
    }
}
