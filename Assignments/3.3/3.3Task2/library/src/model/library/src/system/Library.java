package model.library.src.system;

import model.library.src.model.Book;
import model.library.src.model.LibraryMember;

import java.util.ArrayList;
import java.util.List;

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

    public void borrowBook(LibraryMember member, Book book) {
        // Borrow book from the library
        if (books.contains(book)) {
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

