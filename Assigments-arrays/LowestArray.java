//✅ Problem 2: find out the lowest
public class LowestArray {
    public static void main(String[] args) {

        int[] numbers = { 2, 4, 6, 8, 10 };
        int lowest = numbers[0];
        for (int number : numbers) {
            if (number < lowest) {
                lowest = number;
            }

        }
        System.out.println("lowest = " + lowest);
    }
}
