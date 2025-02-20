package Library;
import java.util.ArrayList;
import java.util.List;

class Borrower {
    private String name;
    private List<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (!book.isBorrowed()) {
            book.borrow();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book.getTitle());
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println(name + " returned: " + book.getTitle());
        }
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                book.displayBookDetails();
            }
        }
    }
}
