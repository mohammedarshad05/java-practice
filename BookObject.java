public class BookObject {
    public static void main(String[] args) {
    Book book1 = new Book("python", "haris", 2.5, 100);
    Book book2 = new Book("Java", "James", 2.5, 100);
    Book book3 = new Book("C++", "Haris", 2.5, 100);


    book1.displayInfoln();
    book2.displayInfoln();
    book3.displayInfoln();


    }

}

class Book {
    String title;
    String author;
    Double price;
    int page;

    Book() {
        this.title = "book";
        this.author = "person";
        this.price = 2.1;
        this.page = 1;
    }

    Book(String t, String a, Double p, int pa) {
        this.title = t;
        this.author = a;
        this.price = p;
        this.page = pa;
    }

    void displayInfoln() {
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price : " + this.price);
        System.out.println("Page : " + this.page);
    }
    
}
