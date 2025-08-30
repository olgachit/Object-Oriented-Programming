import java.util.ArrayList;

public class Book {
    private  String Title;
    private  String Author;
    private int Year;
    private double Rating;
    private ArrayList<String> Reviews;

    public Book(String Title, String Author, int Year) {
        this.Title = Title;
        this.Author = Author;
        this.Year = Year;
        this.Rating = 0.0;
        this.Reviews = new ArrayList<>();
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
    public void setRating(double Rating) {
        if (Rating >= 0 && Rating <= 5) {
            this.Rating = Rating;
        } else {
            System.out.println("Invalid Rating");
        }
    }
    public double getRating() {
        return Rating;
    }
    public void addReview(String Review) {
        Reviews.add(Review);
    }
    public ArrayList<String> getReviews() {
        return Reviews;
    }
}
