@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {

        MathOperation multiply = (a, b) -> {
            return a * b;
        };
        System.out.println("result : " + multiply.operate(4, 7));

    }

}
