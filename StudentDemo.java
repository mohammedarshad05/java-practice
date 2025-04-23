public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("alice", 101, 85);
        student1.calculateGrade(student1.marks);
        student1.display( );

    }

}

class Student {
    String name;
    int rollNo;
    double marks;

    Student(String n, int r, double m) {
        this.name = n;
        this.rollNo = r;
        this.marks = m;
    }

    void calculateGrade(double grades) {
        if (grades >= 90) {
            System.out.println("Grade is A");
        } else if (grades >= 75) {
            System.out.println("Gradeb is B");
        } else if (grades >= 50) {
            System.out.println("Grade is C");

        } else {
            System.out.println("Grade is D");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

}
