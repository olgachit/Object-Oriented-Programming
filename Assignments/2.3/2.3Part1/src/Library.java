import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add methods here
    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        int index = 1;
        for (Book book : books) {
            System.out.println(index+". Title: " + book.getTitle() + "Author: " + book.getAuthor() + "Year: " + book.getYear());
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
}
