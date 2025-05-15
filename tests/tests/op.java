package tests;

import java.util.Optional;

public class op {
    public static void main(String[] args) {
        Optional<Book> optionalBook = getBook("java");
        if (optionalBook.isEmpty()) {
            System.out.println(" book title not found");
        } else {
            Book book = optionalBook.get();
            book.printInfo();
        }
    }

    public static Optional<Book> getBook(String title) {
        Book book = new Book("java", 5);
        return Optional.ofNullable(null);
}
}

class   Book {
    String title;
    int qty;


    public Book(String title, int qty) {
        this.title = title;
        this.qty = qty;
    }

    public void printInfo() {
        System.out.println(" title name: "+this.title);
        System.out.println(" qty name: "+this.qty);
    }
}
