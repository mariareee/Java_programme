import java.util.Scanner;
/*Task:
*       Write a program tha computes initials from full name and displays them.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        String[] strArray = name.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String initials : strArray) {

            sb.append(initials.charAt(0));
        }

        System.out.println(sb.toString());
    }
}