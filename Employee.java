class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void applyBonus(double percent) {
        salary += salary * (percent / 100);
    }

    public void showDetails() {
        System.out.println(name + " - Salary: $" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raj", 30000);
        e1.applyBonus(10); // 10% bonus
        e1.showDetails();
    }
}
