import java.util.Arrays;
public class Book {
    private String title;
    private int yearOfPublishing;
    private String[] authors;

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }

    public String toString(){
        return "title= "
                + title +", year of publishing = "
                + yearOfPublishing
                + ",authors = "
                + Arrays.toString(authors);
    }
}