import java.util.Scanner;

/*Task: Write a program that checks if a given string starts with the prefix "J"
* ignoring the case.The program. Should output true or false.
* */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        System.out.println(string.toLowerCase().startsWith("j")); //case sensitive, detect J/j
        }
    }
