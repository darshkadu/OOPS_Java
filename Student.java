class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void calculateGrade() {
        System.out.println(name + "'s grade: Pass");
    }
}

class HonorsStudent extends Student {
    HonorsStudent(String name) {
        super(name);
    }

    void calculateGrade() {
        System.out.println(name + "'s grade: Honors");
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Ravi"),
            new HonorsStudent("Ram")
        };

        for (Student s : students) {
            s.calculateGrade();
        }
    }
}
