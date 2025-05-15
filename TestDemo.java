public class TestDemo {
    public static void main(String[] args) {
        Book book = new Book("java", 2008, "jhon");
        book.displayInfo();
        Magazine magazine = new Magazine("java", 2008, "jhon");
        magazine.displayInfo();
        Newspaper newspaper = new Newspaper("java", 2008, "jhon");
        newspaper.displayInfo();
}
}

class LibraryItem {
    String title;
    int yearPublished;

    public LibraryItem(String title, int yearPublished) {
        this.title = title;
        this.yearPublished = yearPublished;
    }
    public void displayInfo(){
        System.out.println("title: " + title);
        System.out.println("Publishing year: "+yearPublished);
    }

}

class Book extends LibraryItem {
    String author;

    public Book(String title, int yearPublished, String author) {
        super(title, yearPublished);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("author: " + author);

    }
}

class Magazine extends LibraryItem {
String issueNumber;

public Magazine(String title, int yearPublished, String issueNumber) {
    super(title, yearPublished);
    this.issueNumber = issueNumber;
}

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("issueNumber: " + issueNumber);

    }    
    }
class Newspaper extends LibraryItem {
String editor;

public Newspaper(String title, int yearPublished, String editor) {
    super(title, yearPublished);
    this.editor = editor;
}

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("editor: " + editor);

    }    
    }