//✅ Problem 4: find even and odd numbers
public class ArrayOdd {
    public static void main(String[] args) {
        int[] numbers = { 4, 9, 12, 7, 6, 3 };
        int odd = 0, even = 0;
        for (int n : numbers) {
            if (n % 2 == 0) {
                even++;

            } else {
                odd++;
                
            }
        }
        System.out.println("even numbers :" + even);
        System.out.println("odd numbers :" + odd);
    }

}
