import java.util.Scanner;

/*Write a program that reads a string and checks whether it is
* a palindrome, it reads the same both left to right*/
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine().toLowerCase();

        String palindrome = new StringBuilder(string).reverse().toString();
        System.out.println(string.equals(palindrome));

    }
}