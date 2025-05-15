public class arrsum {

    public static void main(String[] args) {
        int[] numbers = { 7, 8, 2, 5, 34, 6 };
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;

        }
        System.out.println("sum is: "+sum);

    }
}