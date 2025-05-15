@FunctionalInterface
interface MathOperation {
    int calculatesquare(int n);
}


public class LambdaAssignment {
    public static void main(String[] args) {
        MathOperation square = (n) -> {
            return n * n;
        };
        System.out.println("result : " + square.calculatesquare(8));

    }
}