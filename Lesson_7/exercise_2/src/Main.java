import java.util.Scanner;

/*Write a program that reads the name of a city and checks
* if the name ends with "burg".Keep in mind, a city can have
* a short name.The program should output true or false*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce a city: ");
        String city = scan.next();
        //using endsWith to detect the ending
        System.out.println(city.endsWith("burg"));
    }
}