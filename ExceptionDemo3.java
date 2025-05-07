public class ExceptionDemo3 {

    public static void main(String[] args) {
        int[] numbers = new int[3];

        try{
              numbers[20] = 1000;   
            System.out.println(numbers[0]);
        }
        catch (Exception e) {
            System.out.println(" exception occured: " + e.getMessage());
        }
        
        finally {
            System.out.println("in finally block....doing cleanup");
        }
      
            
    }
}