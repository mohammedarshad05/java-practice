public class EncapsulationDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("arshaaaad sayed");
        person1.setAge(24);
        person1.displayInfo();

    }

}

class Person {
    private String name;
    private int age;

    Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    String getName() {
        return this.name;
    }

    void setName(String n) {
        if (n.matches("[A-Za-z]+([ A-Za-z]+)*")) {
            name = n;
        } else {
            System.out.println("Name cannot contain numbers or special characters.");
            return;
        }

        this.name = n;

    }

    int getAge() {
        return this.age;
    }

    void setAge(int a) {
        if (a < 0) {
            System.out.println("Age cannot be less than 0.");
            return;
        }
        if (a > 120) {
            System.out.println("Age cannot be more than 120.");
            return;
        }
        this.age = a;
    }

    void displayInfo() {
        System.out.println("Name :" + this.name);
        System.out.println("Age is : " + this.age);
    }
}
