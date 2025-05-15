public class prime {
    public static void main(String[] args) {
        printprime(6);

    }

    public static void printprime(int n) {
        boolean isPrime = true;
        for (int i = 1; i < n; i++) {
            if (n % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)

        {
            System.out.println(+n+": is prime");

        } else {
            System.out.println(+n+": not primee");
        }
    }

}