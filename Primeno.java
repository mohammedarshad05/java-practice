public class Primeno {
    public static void main(String[] args) {
        isPrime(7);
        isPrime(6);
        isPrime(9);
        isPrime(11);

    }

    public static void isPrime(int n) {
        boolean myPrime = true;
        for (int i = 1; i < n; i++) {
            if (n % 2 == 0) {
                myPrime = false;
                break;
            }
        }
        if (myPrime) {
            System.out.println(+n + "is prime");

        } else {
            System.out.println(+n + "is not a prime");
        }

    }
}
