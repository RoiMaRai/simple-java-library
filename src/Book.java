import java.util.UUID;

public class Book {
    private String bookTitle;
    private int pageAmount;
    private String bookID;

    public Book(String bookTitle,int pageAmount){ // Book ID should be read-only
        this.bookTitle = bookTitle;
        this.pageAmount = pageAmount;
        this.bookID = generateBookUUID();
    }

    private String generateBookUUID() {
        return UUID.randomUUID().toString();
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookID() {
        return bookID;
    }

    public int getPageAmount() {
        return pageAmount;
    }

    public void printBookInfo(){
        System.out.println("Title: "+bookTitle);
        System.out.println("Pages: "+pageAmount);
        System.out.println("ID: "+bookID);
    }
}
