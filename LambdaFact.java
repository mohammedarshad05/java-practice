@FunctionalInterface
interface Factorial {
    int printfactorial(int n);
}


public class LambdaFact {
    public static void main(String[] args) {
        Factorial Fact = (n) -> {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        };
            System.out.println(" Factorial : " + Fact.printfactorial(5));
        }
}
