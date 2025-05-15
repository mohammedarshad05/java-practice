public class sb {
    public static void main(String[] args) {
        String str = "hello world";

        StringBuilder sb = new StringBuilder(str);
        sb.append(" how are you?");

        sb.insert(0, "java ");
        System.out.println(sb);

        sb.replace(11, 16, "universe!");
        System.out.println(sb);

        sb.delete(19, 20);
        System.out.println(sb);
    

        sb.reverse();
        System.out.println("reversed:"+sb);
    }
       
    
}
