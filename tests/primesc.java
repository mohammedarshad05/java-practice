import java.util.Scanner;

public class primesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter  prime num:");
        int num = sc.nextInt();

        boolean isPrime = true;
        for (int i = 1; i < num; i++) {
            if (num % 2 == 0) {
                isPrime = false;
                break;

            }

        }
        if (isPrime) {
            System.out.println(+num + "is prime ");

        } else {
            System.out.println(+num + "is not prime");
        }
    }

}
