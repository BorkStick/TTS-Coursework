import java.util.ArrayList;

public class Library {
    // Add the missing implementation to this class
    String address;
    ArrayList<Book> libraryBooks = new ArrayList<Book>();

    // shows library address
    public Library(String libraryAddress) {
        address = libraryAddress;
    }

    // add a book
    public void addBook(Book book) {
        libraryBooks.add(book);
    }

    // borrow a book
    public void borrowBook(String title) {
        final boolean[] isInCatalog = new boolean[1];
        libraryBooks.forEach(x -> {
            // check if book has been borrowed
            if (x.title.equals(title)) {
                if (!x.borrowed) {
                    x.borrowed = true;
                    System.out.println(title + " has been borrowed.");
                } else System.out.println(title + " is already borrowed.");
                isInCatalog[0] = true;
            }
            ;
        });
        if (!isInCatalog[0]) System.out.println(title + " is not in our catalog");
    }


    // return a book
    public void returnBook(String title) {
        final boolean[] isInCatalog = new boolean[1];
        libraryBooks.forEach(x -> {
            //check if book has been returned
            if (x.title.equals(title)) {
                if (x.borrowed) {
                    x.borrowed = false;
                    System.out.println(title + " has been returned.");
                } else System.out.println(title + " is already checked in.");
                isInCatalog[0] = true;
            }
            ;
        });
        if (!isInCatalog[0]) System.out.println(title + " is not in our catalog");
    }

    // show available books
    public void printAvailableBooks() {
        // if book is not in list
        if (libraryBooks.isEmpty()) {
            System.out.println("The book you are looking for is currently unavailable.");
            // make array with books
        } else {
            ArrayList<String> availableBooks = new ArrayList<>();
            libraryBooks.forEach(x -> {
                if (!x.borrowed) availableBooks.add(x.title);
            });
            System.out.println(availableBooks);
        };
    }

    // show library hours
    public static void printOpeningHours() {
        System.out.println("Open daily from 9am to 5pm");
    }

    // show library address
    public void printAddress() {
        System.out.println(this.address);
    }





    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}