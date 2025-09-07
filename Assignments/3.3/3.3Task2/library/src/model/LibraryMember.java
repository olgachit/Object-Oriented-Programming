package model;

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private static int ID=1;
    private int memberID;
    private ArrayList<Book> borrowedBooks;

    public LibraryMember(String name) {
        this.name = name;
        this.memberID = ID++;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberID() {
        return memberID;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "Member: " + name + " (ID: " + memberID + ")";
    }
}
