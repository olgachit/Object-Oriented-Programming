import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "12345");
        Book book2 = new Book("1984", "George Orwell", "67890");

        library.addBook(book1);
        library.addBook(book2);

        LibraryMember member1 = new LibraryMember("Alice");
        LibraryMember member2 = new LibraryMember("Bob");

        library.addMember(member1);
        library.addMember(member2);

        library.reserveBook(member1, book1);
        library.displayReservedBooks(member1);

        library.reserveBook(member2, book1); // should fail (already reserved)

        library.cancelReservation(member1, book1);
        library.displayReservedBooks(member1);

        library.reserveBook(member2, book1); // now Bob can reserve it
        library.displayReservedBooks(member2);
    }
}

