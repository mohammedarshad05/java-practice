public class StringBuilderAssignment {
    public static void main(String[] args) {
        String s = "Hello world";
        StringBuilder sb = new StringBuilder(s);
        sb.append(" how are you?");
        System.out.println("after Append: " + sb);
        sb.insert(0, "java ");
        System.out.println("after insert: " + sb);

        sb.replace(11, 15, "universe");
        System.out.println("after replace: " + sb);
        
        sb.delete(0, 0)
    }
    
    
}
