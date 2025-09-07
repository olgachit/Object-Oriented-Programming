package system;

import model.Book;
import model.LibraryMember;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        // Add book to the library
        books.add(book);
        System.out.println("Book added: " + book);
    }

    public void addMember(LibraryMember member) {
        // Add member to the library
        members.add(member);
        System.out.println("Member added: " + member);
    }

    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved()) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }

    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book.getTitle());
        }
    }

    public void borrowBook(LibraryMember member, Book book) {
        // Borrow book from the library
        if (books.contains(book) && !book.isReserved()) {
            member.borrowBook(book);
            System.out.println(member.getName() + " borrowed " + book.getTitle());
        } else {
            System.out.println("Book not available: " + book.getTitle());
        }
    }

    public void returnBook(LibraryMember member, Book book) {
        // Return book to the library
        if (member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Book not available");
        }
    }

}

