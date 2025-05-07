public class ExceptionDemo1 {
    public static void main(String[] args) {

        try {

            int result = divide(20, 0);
            System.out.println(" result is : " + result);
        } catch (Exception e) {
            System.out.println(" exception occured " + e);

            System.out.println("continues...");
        }

    }

    public static int divide(int a, int b) {
        int res = a / b;
        return res;
    }
}
