import java.util.Scanner;
/*
Write a program that reads three numbers and checks that they all are different, i.e.
        not equal to one another. The output should be true or false.
*/

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.println( a != b && b != c && a!=c);
    }
}