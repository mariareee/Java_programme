public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Fantastic Beasts","a must-watch movie",2022);
        Movie movie2 = new Movie("The loss",2003);

        PrintMovie(movie1);
        PrintMovie(movie2);
    }
    public static void PrintMovie(Movie movie) {
        System.out.println(movie.title + " | " + movie.desc+" | " + movie.year);
    }
}