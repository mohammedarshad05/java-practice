public class exc {

    public static void main(String[] args) {

        try{

            int res = divide(18, 0);
            System.out.println("result"+res);
        } catch (Exception e) {
            System.out.println("exception occured" + e);
            
            System.out.println("continues");

        }
     
    }
    
    public static int divide(int a, int b) {
        int res = a / b;
        return res;
    }
}