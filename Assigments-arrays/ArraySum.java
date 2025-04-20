//✅ Problem 1: Sum of Elements in an Array
public class ArraySum {
    public static void main(String[] args) {

        int[] numbers = { 2, 4, 6, 8, 10 };
        int sum=0;
        for (int number : numbers) {
            sum = sum + number;

            System.out.println("sum = " + sum);
        }
    }
}
    

