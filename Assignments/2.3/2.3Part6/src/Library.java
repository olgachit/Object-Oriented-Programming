import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    // Add methods here
    public void addBook(Book book) {
        books.add(book);
    }
    public void addUser(User user) {
        users.add(user);
    }

    public void displayBooks() {
        int index = 1;
        for (Book book : books) {
            System.out.println(index + ". Title: " + book.getTitle() + "Author: " + book.getAuthor() + "Year: " + book.getYear());
            index++;
        }
    }

    public void findBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Title: " + book.getTitle() + ", Year: " + book.getYear());
            }
        }
    }

    public void borrowBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                user.borrowBook(book);
                System.out.println(user.getName() + " borrowed "+book.getTitle());
            }
        }
        System.out.println("Book not available");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.add(book);
                System.out.println("Book returned: " + book.getTitle());
            }
        }
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public double getAverageRating() {
        double total = 0;
        for (Book book : books) {
            total += book.getRating();
        }
        return total / books.size();
    }

    public Book getMostReviewedBook() {
        Book mostReviewedBook = null;
        for (Book book : books) {
            if (book.getReviews().size() > mostReviewedBook.getReviews().size()) {
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook;
    }
}
