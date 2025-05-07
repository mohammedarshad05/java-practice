package library.books;

import library.LibraryItem;

public class Book extends LibraryItem {
    public String author;

    
    public Book(String title, int yearPublished, String author) {
        super(title, yearPublished);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Author: " + author);
        System.out.println("*****End of Book Details *****");
    }
}