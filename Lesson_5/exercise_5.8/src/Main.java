/* Given three natural numbers A,B,C.Determine if a triangle with these sides can exist
*  If exists output : Yes, else ; No
*  1. A+B>C 2.A+C>B  3.B+C>A*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce the first triangle side: ");
        int a = scanner.nextInt();
        System.out.println("Introduce the second triangle side: ");
        int b = scanner.nextInt();
        System.out.println("Introduce the third triangle side: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("YES, these sides exist");
        }
        else{
            System.out.println("NO, these sides do not exist");
        }
    }
}