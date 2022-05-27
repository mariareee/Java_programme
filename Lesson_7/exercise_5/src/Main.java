import java.util.Scanner;

/*Write a program that findds the frequency of occurences of a substring in
* a given string.Substrings cannot overlap: for example, the string ababa
* contains only one substring aba.
* Input data format: The first input line contaians a string, the second
*                    one contains a substring*/
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String substring = scan.nextLine();

        String[] split = string.split(substring);
        int countSubstring = split.length ; // counts the length str str str => 3

        System.out.println(countSubstring);
    }
}