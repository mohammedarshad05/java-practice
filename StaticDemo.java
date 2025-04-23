public class StaticDemo {
    public static void main(String[] args) {
        Mathutils.square(5);
        System.out.println();
        int fact = Factorial.fact(5);
        System.out.printf("factorial of 4 = %d", fact);

        System.out.println();
        Prime.prime(4);
    }
}

class Mathutils {
    static void square(int n) {
        int sq = n * n;
        System.out.printf("square of %d  = %d", n, sq);

    }
}

class Factorial {
    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        return fact;
    }

}

class Prime {
    static void prime(int n) {
        boolean isPrime = true;
        for (int i = 1; i < n; i++) {
            if (n % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println( + n +" is a prime number ");

        } else {
            System.out.println(+ n +" is not a prime number" );
        }

    }
}