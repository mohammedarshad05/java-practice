import library.LibraryItem;
import library.books.Book;
import library.books.magazines.Magazine;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryItem library = new LibraryItem("JAVA", 2025);
        library.displayInfo();

        Book book1 = new Book("JAVA", 2025, "william shakespear");
        book1.displayInfo();

        Magazine mag = new Magazine("JAVA", 2025, "56");
        mag.displayInfo();
        
    }
    
}
