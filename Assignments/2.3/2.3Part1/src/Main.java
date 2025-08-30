public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K Rowling", 1995);
        Book book2 = new Book("Animal Farm", "George Orwell", 1945);
        Book book3 = new Book("Fantastic Beasts", "J.K Rowling", 2001);
        Book book4 = new Book("Great Gatsby", "F. Scott Fitzgerald", 1925);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("library catalog:");
        library.displayBooks();
        System.out.println();

        String searchAuthor = "J.K Rowling";
        System.out.println("Books by author \"" + searchAuthor + "\":");
        library.findBooksByAuthor(searchAuthor);

    }
}
