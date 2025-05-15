public class arrod {

    public static void main(String[] args) {
        int[] numbers = { 3, 6, 4, 1, 2, 7, 8, 9, 99 };
        int odd = 0; int even=0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("even" + even);
        System.out.println("odd"+odd);
    }
}