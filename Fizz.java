public class Fizz {
    public static void main(String[] args) {
        PrintFizz(10);
    }

    public static void PrintFizz(int n) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz");
            } else {

                System.out.println(i);
            }
        }
    }

}
