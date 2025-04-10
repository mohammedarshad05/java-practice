public class OddEven {
    public static void main(String[] args) {
        printOddEven(6);
        printOddEven(8);
        printOddEven(88);
        printOddEven(111);

    }
    public static void printOddEven(int n){
        int remainder = n % 2;
        if(remainder == 0){
            System.out.println(n + " is even");
        }else {
            System.out.println(n + " is odd");
        }
    }

}
