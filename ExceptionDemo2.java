import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        String str = null;
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println(" length of string = " + str.length());
        } catch (Exception e) {
            System.out.println(" exception is occrured :" + e.getMessage());
        }
        finally {
            System.out.println("in finally block....doing cleanup");
            scanner.close();
        }
        System.out.println(" total quantity of products :" + 1000*6);
    }

}
