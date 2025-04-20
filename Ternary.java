// Ternary 

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();


        String result = (age >= 18) ? " eligible to vote" : "Not eligible";
        System.out.println( name + ", you are" + result);
    }
    
}
