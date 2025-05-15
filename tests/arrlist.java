import java.util.ArrayList;
import java.util.Scanner;

public class arrlist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> books = new ArrayList<>();
        books.add("java");
        books.add("python");
        books.add("html");
        books.add("css");
        books.add("js");

        System.out.println("enter a book title to search: ");
        String SearchBooks = sc.nextLine();
        boolean isvalid = true;
        if (books.contains(SearchBooks)) {
            System.out.println("the book " + SearchBooks + "exists in library");
        } else {
            System.out.println("the doesnt" + SearchBooks + "doesnt exists in lib");
        }

        System.out.println("enter a book title to emove: ");
        String RemoveBooks = sc.nextLine();
        if (books.remove(RemoveBooks)) {
            System.out.println("the book " + RemoveBooks + "removed: ");
        } else {
            System.out.println("the book" + RemoveBooks + "not exists");
        }

        for (String book : books) {
            System.out.println(book);

        }
    }
}