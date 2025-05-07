public class InterfaceDemo {

    public static void main(String[] args) {
        Animals dog = new dogs();
        work(dog);
        Animals cat = new cats();
        work(cat);

    }

    static void work(Animals animal) {
        animal.eat();
        animal.makesound();

    }
}



interface Animals {
    void makesound();
    void eat();
}


class dogs implements Animals {
    public void makesound() {
        System.out.println("Dog barks: wooof! wooof!");
    }

    public void eat() {
        System.out.println("Dog eats BONES.");
    }
}

class cats implements Animals {
    public void makesound() {
        System.out.println("Cat meows: meow! meow!");
    }

    public void eat() {
        System.out.println("Cat eats FISH.");
    }
}
