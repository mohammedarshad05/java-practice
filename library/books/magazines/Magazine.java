package library.books.magazines;

import library.LibraryItem;

public class Magazine extends LibraryItem {
    public String issueNumber;
    
    public Magazine(String title, int yearPublished, String issueNumber) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("*****End of Magazine Details *****");
    }
}