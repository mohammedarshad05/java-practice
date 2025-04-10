public class whileLoop {
    public static void main(String[] args) {
        printTable(79);
        
    }
     public static void printTable(int n){
        System.out.println(" ~~~📑Table of " + n + "~~~");
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " x " + i + " = " + n * i);
            i++;
        }
        System.out.println();
    
}
}

