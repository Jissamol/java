abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Encapsulation: Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Encapsulation: Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Abstract method
    public abstract String getType();
}



class Book extends LibraryResource {
    public Book(String title, String author) {
        super(title, author);
    }

    public String getType() {
        return "Book";
    }
}


class Magazine extends LibraryResource {
    public Magazine(String title, String author) {
        super(title, author);
    }

    public String getType() {
        return "Magazine";
    }
}



class DVD extends LibraryResource {
    public DVD(String title, String author) {
        super(title, author);
    }

    public String getType() {
        return "DVD";
    }
}


public class LibraryMain {
    public static void main(String[] args) {
        LibraryResource book = new Book("The Alchemist", "Paulo Coelho");
        LibraryResource magazine = new Magazine("National Geographic", "Various");
        LibraryResource dvd = new DVD("Inception", "Christopher Nolan");

        printResourceDetails(book);
        printResourceDetails(magazine);
        printResourceDetails(dvd);
    }

    public static void printResourceDetails(LibraryResource resource) {
        System.out.println("\nType: " + resource.getType());
        System.out.println("Title: " + resource.getTitle());
        System.out.println("Author: " + resource.getAuthor());
    }
}
