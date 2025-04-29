public class AbstractEmployee {

    public static void main(String[] args) {
        employee employee1 = new fullTimeEmployee("mohammed Arshad", 101, 50000.00);
        employee employee2 = new partTimeEmployee("ammaar", 102, 200.00, 15);

        printEmployee(employee1);
        printEmployee(employee2);
    }

    public static void printEmployee(employee emp) {
        emp.displayDetails();
    }
}

abstract class employee {
    String name;
    int employeeId;

    employee(String a, int e) {
        this.name = a;
        this.employeeId = e;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class fullTimeEmployee extends employee {
    double monthlySalary;

    fullTimeEmployee(String a, int e, double m) {
        super(a, e);
        this.monthlySalary = m;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class partTimeEmployee extends employee {
    double hourlyWage;
    int hoursWorked;

    partTimeEmployee(String string, int i, double d, int w) {
        super(string, i);
        this.hourlyWage = d;
        this.hoursWorked = w;
    }

    @Override
    double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}