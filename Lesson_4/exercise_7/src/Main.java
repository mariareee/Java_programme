import java.util.Scanner;
/*Write a program that reads an integer value and checks if it is less than 10 and
        greater than 0. Your program should print a boolean value (true or false).*/
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.println( a > 0 && a < 10);
    }
}