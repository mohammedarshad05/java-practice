public class Variables {
    public static void main(String[] args) {
        System.out.println(" java is an object oriented programming language");
        int sum2 = add(25, 75);
        System.out.println(sum2);

        float result2 = decim(9, 7);
        System.err.println(result2);
    }



    public static int add( int a, int b){
        int sum = a + b;
        return sum;
    }


    public static float decim(float x,float y){
        float result = x / y;
        return result;
    }


    
    
}
