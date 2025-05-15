import java.util.Scanner;

@FunctionalInterface
interface Addition {
    int Add(int a, int b);
}

public class lambda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter first number: ");
        int num1 = sc.nextInt();
        System.out.println(" enter second number: ");
        int num2 = sc.nextInt();


        Addition add=(a,b)->{
            return a + b;
        };
        System.out.println("result: "+add.Add(num1, num2));
    }
}
