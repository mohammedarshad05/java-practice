public class hi {
    public static void main(String[] args) {
        System.out.println("hello world of java");
        int sum = add(79, 89);
        System.out.println(sum);
         
        float res =decim(8,7);
        System.out.println(res );

    }
    public static int add(int h,int i){
        int sum = h+ i;
        return sum;
    }
    public static float decim(float x,float y){
        float result = x/ y;
        return result;
    }
    }

