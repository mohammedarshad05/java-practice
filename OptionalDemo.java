import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Cat> optionalcat = getCatByName("Max");
        
    //     if (optionalcat.isEmpty()) {
    //         System.out.println("Cat not found");
    //     } else {
    //         Cat cat = optionalcat.get();
    //         cat.printInfo();
    //     }

    // }
        if (optionalcat.isPresent()) {
            Cat cat = optionalcat.get();
            cat.printInfo();
        } else {
            System.out.println("Cat not found");
        }

    }

    
    public static Optional<Cat> getCatByName(String name){
        Cat cat = new Cat("max", 2);
        return Optional.ofNullable(null);
        
    }
}

class Cat {
    String name;
    int age;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }
    
    public void printInfo() {
        System.out.println(" cat name: " + this.name);
        System.out.println(" cat age: " + this.age);
    }
}