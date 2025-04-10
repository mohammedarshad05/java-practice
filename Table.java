public class Table {
    public static void main(String[] args) {
        printTable(5);
        printTable(44);
        printTable(14);
    
    }
    public static void printTable( int n){
        System.out.println(" ~~~Table of " + n + "~~~");
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
        System.out.println();
    }
    
}
