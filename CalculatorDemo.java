public class CalculatorDemo {
    public static void main(String[] args) {
        
        SimpleCalculator calculator = new SimpleCalculator();
        int result1 = calculator.add(4, 5);
        calculator.printNumber(result1);
        System.out.println("addition :"+result1);
        int result2 = calculator.subtract(10, 5);
        calculator.printNumber(result2);
        System.out.println("substraction :" + result2);
        
        
        System.out.println("Is 10 positive? " + Calculator.isPositive(10));
        System.out.println("Is -5 positive? " + Calculator.isPositive(-5));

    }

}

interface Calculator {
    int add(int a, int b);

    int subtract(int a, int b);

    static boolean isPositive(int number) {
        boolean isGreaterThanZero = number > 0;
        return isGreaterThanZero;
    }

    default void printNumber(int n) {
        System.out.println(" the number is :" + n);
    }
}
class SimpleCalculator  implements Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
