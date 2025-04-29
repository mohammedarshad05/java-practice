
public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("jhon", 24);
        person1.displayInfo();

    }

}

class Person {

    String name;
    int age;

    Person() {
        this.name = "Unknown";
        this.age = 25;
    }

    Person(String n, int a) {
        this.name = n;
        this.age = a;

    }

    void displayInfo() {
        System.out.println("Name :" + this.name);
        System.out.println("Age is : " + this.age);
    }

}