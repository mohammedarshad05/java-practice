import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("core java");
        courses.add("web development");
        courses.add("react advance");
        courses.add("c programming");

        courses.add(4, "python");
        courses.clear();





        for (String c : courses) {
            System.out.println(c);            
        }

        
    }
    
}
