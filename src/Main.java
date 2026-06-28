import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryHandler libraryHandler = new LibraryHandler();

        while (true){
            System.out.println("################################################################");
            System.out.println("CMD: 1,addBook | 2,removeBookFromID | 3,searchBookFromTitle");
            System.out.println("CMD: 4,searchBookFromID | 5,printAllBookInLibrary");
            System.out.println("################################################################");

            int cmd = scanner.nextInt();
            scanner.nextLine();

            if (cmd == 1){ // addBook
                System.out.println("Enter book name or 'CANCEL' to cancel operation.");
                String bookName = scanner.nextLine();
                if (bookName.equals("CANCEL")){
                    continue;
                }

                System.out.println("Enter book page amount or '0' to cancel operation.");

                int pageNumber = scanner.nextInt();
                scanner.nextLine();

                if (pageNumber == 0){
                    continue;
                }

                Book newBook = new Book(bookName,pageNumber);
                libraryHandler.addBook(newBook);
                newBook.printBookInfo();
            } else if (cmd == 2) { // removeBookFromID
                System.out.println("Enter book ID or 'CANCEL' to cancel operation.");
                String bookID = scanner.nextLine();
                if (bookID.equals("CANCEL")){
                    continue;
                }
                libraryHandler.removeBookFromBookID(bookID);
            } else if (cmd == 3) { // searchBookFromTitle
                System.out.println("Enter book title or 'CANCEL' to cancel operation.");
                String bookTitle = scanner.nextLine();
                if (bookTitle.equals("CANCEL")){
                    continue;
                }
                Book book = libraryHandler.searchBookFromTitle(bookTitle);
                if (book != null){
                    System.out.println("BOOK FOUND");
                    book.printBookInfo();
                }
                else
                {
                    System.out.println("No book found from title: "+bookTitle);
                }
            } else if (cmd == 4) { // searchBookFromID
                System.out.println("Enter book ID or 'CANCEL' to cancel operation.");
                String bookID = scanner.nextLine();
                if (bookID.equals("CANCEL")){
                    continue;
                }
                Book book = libraryHandler.searchBookFromBookID(bookID);
                if (book != null){
                    System.out.println("BOOK FOUND");
                    book.printBookInfo();
                }
            } else if (cmd == 5) { // printAllBookInLibrary
                libraryHandler.printAllBookInLibrary();
            }
        }
    }
}
