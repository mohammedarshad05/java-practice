public class InheritenceDemo {
    public static void main(String[] args) {

    }

}

class Person {
    protected String name;
    protected int age;

    Person() {
        this.name = " unknown";
        this.age = 0;
    }

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    void setName(String n) {
        String trimmName = n.trim();
        boolean isNameValid = trimmName.matches("[A-Za-z]+$");
        if (isNameValid == true) {
            this.name = n;
        } else {
            System.out.println(n + " is not a valid name");
        }
    }

    int getAge() {
        return this.age;
    }
}
