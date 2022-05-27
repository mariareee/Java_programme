import java.util.Scanner;

/*Write a program that reads a string and two integer numbers.
* These two numbers are representing a range thea includes them
* both.Print the substriing enclosed in this range.*/

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.next(); ///Mary
        int number1 = scan.nextInt();//0
        int number2 = scan.nextInt();//2
        System.out.println(str1.substring(number1, number2 + 1));//-> Mar

    }
}
