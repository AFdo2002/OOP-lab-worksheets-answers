package library.books;

/**
 * Represents a fictional book.
 */
public class FictionBook {
    private String title;
    private String author;
    private String genre;

    // Constructor
    public FictionBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    // Getters and Setters (optional, if needed)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    // Method to display information about the book
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}
