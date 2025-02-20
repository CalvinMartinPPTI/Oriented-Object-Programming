package Library;
import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to library: " + book.getTitle());
    }

    public void borrowBook(Borrower borrower, Book book) {
        if (books.contains(book) && !book.isBorrowed()) {
            borrower.borrowBook(book);
        }
    }

    public void returnBook(Borrower borrower, Book book) {
        borrower.returnBook(book);
    }

    public void displayLibraryBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                book.displayBookDetails();
            }
        }
    }
}
