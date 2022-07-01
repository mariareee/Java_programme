import java.util.Arrays;
public class Book {
     private String title;
     private int yearOfPublishing;
     private String[] authors;
    //constructor with no fields
    public Book(){

    }
    //constructor with all fields
    public Book(String title, int yearOfPublishing, String[] authors){
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }
    //getters & setters
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getYearOfPublishing(){
        return yearOfPublishing;
    }
    public void setYearOfPublishing(int yearOfPublishing){
        this.yearOfPublishing = yearOfPublishing;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
    public void printBookInfo(){
        System.out.println( " Title : " + title + "year published: " + yearOfPublishing );
    }

}
