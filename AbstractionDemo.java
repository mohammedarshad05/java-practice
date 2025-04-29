public class AbstractionDemo {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makesound();
        animal2.makesound();

        animal1.sleep();
        animal2.sleep();

    }

}

abstract class Animal {
    abstract void makesound();

    void sleep() {
        System.out.println("sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makesound() {
        System.out.println("Dog barks: woof! woof! ");
    }
}

class Cat extends Animal {
    @Override
    void makesound() {
        System.out.println("cat meow: meow! meow!");
    }
}
