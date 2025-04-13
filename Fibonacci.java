public class Fibonacci {
    public static void main(String[] args) {
        Fibseries(9);

    }

    public static void Fibseries(int n) {
        int val1 = 0;
        int val2 = 1;
        int val3 = 1;
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        for (int i = 2; i <= n; i++) {
            val3 = val1 + val2;
            System.out.println(val3);
            val1 = val2;
            val2 = val3;

        }

    }
}
