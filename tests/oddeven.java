public class oddeven {
    public static void main(String[] args) {
        printoe(7);

    }

    public static void printoe(int n) {
        int remainder = n % 2;
        if (remainder == 0) {
            System.out.println("event");
        } else {
            System.out.println("odd");
        }
    }
    
}
