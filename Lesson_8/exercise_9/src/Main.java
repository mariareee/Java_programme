/*Given a recursive method which should print an input string in the
reverse order.Now the method prints the string in the same order. Fix
the method.After your fix, the method must be recursive.
*/
import java.util.Scanner;
public class Main {
    /* Fix this method */
    public static void printReverseCharByChar(String s) {
        if (s.length() > 0) {
            int last = s.length() - 1;
            System.out.print(s.charAt(last));  //changed the place of sout
            printReverseCharByChar(s.substring(0, last));

        }
    }
    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        printReverseCharByChar(scanner.nextLine());
    }
}