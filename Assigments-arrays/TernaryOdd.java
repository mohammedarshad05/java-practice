import java.util.Scanner;

public class TernaryOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number : ");
        int number = scanner.nextInt();
        
        int remainder = number % 2;
        String result = (remainder == 0) ? "even" : "odd";
        System.out.println(number + " is " + result);


    }
}
