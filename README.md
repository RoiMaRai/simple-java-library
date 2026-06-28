# simple-java-library

A mock system of library in Java.

Features:
- Book class includes: bookTitle, pageAmount, and bookID (UUID-Read-Only)
- Adding book to the library
- Removing book from the library via bookID
- Searching for book from title keyword

Concepts: ArrayList, UUID, Simple String Search, Class structure, Method structure

How to use:
Run > Read Console > Input

Example below:

################################################################
CMD: 1,addBook | 2,removeBookFromID | 3,searchBookFromTitle
CMD: 4,searchBookFromID | 5,printAllBookInLibrary
################################################################

> 1

Enter book name or 'CANCEL' to cancel operation.

> L'Etranger

Enter book page amount or '0' to cancel operation.

> 165

Title: L'Etranger
Pages: 165
ID: 7330738c-a088-405a-9126-1d39aaba825b

################################################################
CMD: 1,addBook | 2,removeBookFromID | 3,searchBookFromTitle
CMD: 4,searchBookFromID | 5,printAllBookInLibrary
################################################################

> 3

Enter book title or 'CANCEL' to cancel operation.

> Etranger

Title: L'Etranger
Pages: 165
ID: 7330738c-a088-405a-9126-1d39aaba825b
1 book(s) found from title: Etranger