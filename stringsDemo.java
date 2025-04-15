public class stringsDemo {
    public static void main(String[] args) {
        String firstName = "yusufpathan ";
        String lastName = "khan";
        String fullName = firstName.concat(lastName);


        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println(fullName.substring(5));
        System.out.println(fullName.contains("khan"));
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(firstName.endsWith("pathan"));
        System.out.println(fullName.startsWith("yusuf"));
        System.out.println(fullName.charAt(4));

    }

    
}
