public class Book {
    String title;
    int yearOfPublishing;
    String[] authors;

    public Book(String title, int yearOfPublishing,String[] authors){
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        authors = java.util.Arrays.copyOf(authors, authors.length);
    }
}
