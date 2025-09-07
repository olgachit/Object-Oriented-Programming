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

        library.borrowBook(member1, book1);
        library.borrowBook(member2, book1);

        library.returnBook(member1, book1);
        library.borrowBook(member2, book1);
    }
}

