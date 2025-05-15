public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = "Hello";

        StringBuilder sb = new StringBuilder(s);
        sb.append(" world!!!!!!!");
        System.out.println("after Append: " + sb);

        sb.insert(6, "exciting ");
        System.out.println("after insert: " + sb);

        sb.replace(6, 15, "Amazing ");
        System.out.println("after replace: " + sb);

        sb.delete(6, 14);
        System.out.println("after delete" + sb);

        sb.reverse();
        System.out.println("after reverse: " + sb);

        System.out.println("length: " + sb.length());
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);

    }
}