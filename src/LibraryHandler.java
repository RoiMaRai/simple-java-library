import java.util.ArrayList;

public class LibraryHandler {
    private ArrayList<Book> libraryBookData = new ArrayList<>();

    public void addBook(Book book){
        if (book == null) return;
        libraryBookData.add(book);
    }
    public void removeBookFromBookObject(Book book){
        if (book == null) return;
        libraryBookData.remove(book);
    }
    public void removeBookFromBookID(String bookID){
        if (bookID == null) return;
        libraryBookData.removeIf(book -> book.getBookID().equals(bookID));
    }
    public Book searchBookFromTitle(String title){
        if (title == null) return null;

        int numOfBookFound = 0;
        for (Book book : libraryBookData){
            if (book.getBookTitle().toLowerCase().contains(title.toLowerCase())){
                numOfBookFound+=1;
                book.printBookInfo();
            }
        }
        System.out.println(numOfBookFound+" book(s) found from title: "+title);
        return null;
    }
    public Book searchBookFromBookID(String bookID){
        if (bookID == null) return null;
        for (Book book : libraryBookData){
            if (book.getBookID().equalsIgnoreCase(bookID)){
                return book;
            }
        }
        return null;
    }
    public void printAllBookInLibrary(){
        for (Book book : libraryBookData){
            book.printBookInfo();
        }
    }
}
