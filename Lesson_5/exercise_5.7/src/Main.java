
/*Find whether the given year is a leap year.
* Just a reminder:leap years are those years in which the
* year's number is either divisible by 4, but not divisible by 100,
* or divisible by 400.
* Output:"Leap" if the year is a leap year and "Regular" otherwise*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean condition = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) {
            System.out.println(condition ? "Leap" : "Regular");
    }
}