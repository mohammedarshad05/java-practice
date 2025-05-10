import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBookList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> books = new ArrayList<>();
        books.add("1.The Cather in the Rye ");
        books.add("2.To kill a Mockingbird");
        books.add("3.1984");
        books.add("4.Price and Prejudice");
        books.add("5.The Greate Gatsby");

        System.out.print("enter a book title to remove: ");
        String RemoveBooks = scanner.nextLine();
        {
            if (books.remove(RemoveBooks)) {
                System.out.println("the book " + RemoveBooks + " has been removed.");
            } else {
                System.out.println("the book " + RemoveBooks + " does not exist in the library.");
            }

        }
        System.out.print("enter a book title to search: ");
        String SearchBooks = scanner.nextLine();
        {

            if (books.contains(SearchBooks)) {
                System.out.println("the book " + SearchBooks + " exists in the library");
            } else {
                System.out.println("the book " + SearchBooks + " does not exist in the library");
            }

            for (String book : books) {
                System.out.println(book);

            }

        }

    }
}
