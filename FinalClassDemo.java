public class FinalClassDemo {
    
}

final class calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}

/*
class SimpleCalculator extends calculator { // This will cause a compilation ❌error because the class is final and cannot be extended
}
 * cannot extend final class calculator
 */
