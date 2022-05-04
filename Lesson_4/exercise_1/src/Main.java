import java.util.Scanner;
/*
Write a program that reads four integer numbers from one line and prints them each
        in a new line. In the input line numbers are separated by one or more spaces.
*/

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int a = s.nextInt();
       int b = s.nextInt();
       int c = s.nextInt();
       int d = s.nextInt();

        System.out.println(a);
        System.out.println(" ");
        System.out.println(b);
        System.out.println(" ");
        System.out.println(c);
        System.out.println(" ");
        System.out.println(d);


    }
}