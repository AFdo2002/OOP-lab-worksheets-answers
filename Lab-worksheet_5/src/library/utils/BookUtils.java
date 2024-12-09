package library.utils;

import library.books.FictionBook;

/**
 * Utility class for book-related operations.
 */
public class BookUtils {

    /**
     * Prints details of the given FictionBook object.
     * @param book A FictionBook object.
     */
    public static void printBookDetails(FictionBook book) {
        System.out.println("Book Details:");
        book.displayInfo();
    }
}
