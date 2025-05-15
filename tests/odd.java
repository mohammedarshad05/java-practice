import java.util.Scanner;


public class odd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int num = scanner.nextInt();

        int remainder = num % 2;
        String result = (remainder == 0) ? "even" : "odd";
        System.out.println(result);

    }
    
}