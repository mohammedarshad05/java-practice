public class Fact {
    public static void main(String[] args) {
        printfact(5);
        
    }

    public static void printfact(int n){
        System.out.println(" ~~~ Factorial of " + n + "~~~");
        int fact = 1;
        for ( int i = 1; i <= n; i++){
            fact = fact * i;
            System.out.println(fact);
        }

    }
    
}
