public class array {

    public static void main(String[] args) {
        int[] numbers = { 1, 7, 8, 11, 23, 4, 1, 5 };
        int largest = numbers[0];
        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
            
        }
        System.out.println("liowesttttt:"+largest);
    }
}