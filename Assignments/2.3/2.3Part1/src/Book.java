public class Book {
    private  String Title;
    private  String Author;
    private int Year;

    public Book(String Title, String Author, int Year) {
        this.Title = Title;
        this.Author = Author;
        this.Year = Year;
    }

    public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public int getYear() {
        return Year;
    }
    public void setYear(int Year) {
        this.Year = Year;
    }
}
