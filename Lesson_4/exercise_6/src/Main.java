import java.util.Scanner;
/*Write a program that reads two double values and prints the difference between the
        second and the first one.*/
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();

        System.out.println( y - x);
    }
}