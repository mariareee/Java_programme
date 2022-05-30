/*Implement a method that checks whether a given English letter
is a vowel or not.The input may be in any case. Vowel: A, E, I, O, U.*/
import java.util.Scanner;
public class Main {

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
    public static boolean isVowel(char ch) {
        //write your code here

        char[] vowel ={'A','E','I','O','U','a','e','i','o','u'};
        for(char i: vowel){
            if(String.valueOf(i).equals(String.valueOf(ch))){
                return true;
            }
        }
        return false;
    }
}