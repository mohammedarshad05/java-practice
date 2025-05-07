package library;

public class LibraryItem {
    public String title;
    public int yearPublished;


    public LibraryItem(String title, int yearPublished) {
        this.title = title;
        this.yearPublished = yearPublished;

    }

    public void displayInfo() {
        System.out.println("*****Library Item Details *****");
        System.out.println("Title: " + title);
        System.out.println(" year Published: " + yearPublished);
    }


}
