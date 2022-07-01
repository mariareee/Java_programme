/*You are given a class named Movie.Write two
constructors for the class.
 - the first constructor should take three arg(title,desc, year)
 and initiialize title and year.
  - the second one should take only two arguments(title, year) and
  initializa title and year.In this case, the field desc shoul have
  the value "empty"*/
public class Movie {
    String title;
    String desc;
    int year;

    // 1'st constructor
    Movie(String title, String desc, int year){
        this.title = title;
        this.desc = desc;
        this.year = year;
    }
    // 2'nd constructor
    Movie(String title, int year){
        //this(title,"empty",year); -> the short way
        this.title = title;
        this.desc = "empty";
        this.year = year;
    }

}
