package model;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {
    private String name;
    private static int ID=1;
    private int memberID;
    private ArrayList<Book> borrowedBooks;
    private List<Book> reservedBooks = new ArrayList<>();

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

    public void addReservedBook(Book book) {
        reservedBooks.add(book);
    }

    public void removeReservedBook(Book book) {
        reservedBooks.remove(book);
    }

    public boolean hasReservedBook(Book book) {
        return reservedBooks.contains(book);
    }

    public List<Book> getReservedBooks() {
        return reservedBooks;
    }

    @Override
    public String toString() {
        return "Member: " + name + " (ID: " + memberID + ")";
    }
}
