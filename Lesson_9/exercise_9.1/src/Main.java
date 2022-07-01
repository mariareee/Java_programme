/*Write a class named Book.It must have three fields;
* - 1.string title
* - 2.int field yearOfPublishing
* - 3.boolean field isAvailable */
public class Main {
    public static void main(String[] args) {


        Book bookOne = new Book();

        bookOne.title = "Howks";
        bookOne.yearOfPubl = 2025;
        bookOne.isAvailable = true;

        System.out.println(bookOne.title + " " + bookOne.yearOfPubl + " " + bookOne.isAvailable + " ");
    }
}

