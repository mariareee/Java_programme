/*Create a class named Book.It has three fields: a string field title,
 an int field yearOfPublishing and an array of strings authors. Write
 getters and setters for all fields, and two constructors.Default constructor
 and a constructor with all fields.*/
public class Main {
    public static void main(String[] args) {

        Book book = new Book("The storyteller ", 2004 , new String[]{"Oscar Wilde" , "Jeff Clint"});

        book.printBookInfo();
        //changing with a setter the date
        book.setYearOfPublishing(2010);
        book.printBookInfo();


    }
}