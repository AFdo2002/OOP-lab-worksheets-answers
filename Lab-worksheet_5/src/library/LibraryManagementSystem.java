package library;

import library.books.FictionBook;
import library.utils.BookUtils;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a FictionBook object
        FictionBook book = new FictionBook("1984", "George Orwell", "Dystopian");

        // Print book details using BookUtils
        BookUtils.printBookDetails(book);
    }
}
