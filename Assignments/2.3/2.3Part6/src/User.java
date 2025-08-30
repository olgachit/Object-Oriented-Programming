import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        borrowedBooks = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
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
    public void displayBorrowedBooks(){
        if(borrowedBooks.isEmpty()){
            System.out.println("No books borrowed.");
        } else {
            System.out.println(name+" borrowed ");
            for (Book book : borrowedBooks) {
                System.out.println("- " + book.getTitle());
            }
        }
    }
}
