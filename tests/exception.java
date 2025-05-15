
public class exception {
    public static void main(String[] args) {
        try{
        int result = sq(18, 0);
        System.out.println(result);
    } catch (Exception e) {
        System.out.println("exc occured" + e.getMessage());
            


        }finally{
            System.out.println("connnnnnn");
        }

    }

    public static int sq(int a,int b){
        int rest = a / b;
        return rest;
    }

}
