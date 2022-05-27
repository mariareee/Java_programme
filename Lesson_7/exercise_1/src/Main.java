import java.util.Scanner;
/*Task: Write a program that reads a string and replaces all
* occurances of the letter 'a' with the letter 'b'.The
* program should print out the resulting string.*/
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String string = scan.next();
       //replacing the "a's" with "b's"
        String replaceString = string.replace("a","b");

        System.out.println(replaceString);
    }
}