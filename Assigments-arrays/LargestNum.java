//✅ Problem 3: find out the largest num
public class LargestNum {
    public static void main(String[] args) {

        int[] numbers = { 10, 35, 7, 89, 23, 1, 45 };
        int largest = numbers[0];
        for (int number : numbers) {
            if ( number > largest ){
                largest = number;
            }
            
            
        }
        System.out.println("largest = " + largest);
    }
}
