/*Task:
*     given the method namedextractInt that takes a double value and returns an integer value.
*     write a body of the method.it should return only  the integer
*     part of the given value.*/
import java.util.Scanner;
public class Main {

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
    public static int extractInt(double d) {
        //added the int part
        return (int) d; //10.256548 ->10
    }
}
