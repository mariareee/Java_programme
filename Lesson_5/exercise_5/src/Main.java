/* Task:
Residents of the country of Malevia often experiment with the plan of their rooms.
        Rooms can be triangular, rectangular, and round. Write a program that calculates the
        floorage of the rooms.
        Input data format: The type of the room shape and the relevant parameters.
        Output data format: The area of the resulting room.
        Note that the value of 3.14 is used instead of the number π in Malevia

        Note, the input values (a, b, c, r) are doubles and your answer should be, too.

*/

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String figure = scan.next();
        // define all variables
        double pi = 3.14;
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double r = scan.nextDouble();

        //Calculate the area
        double s = (a + b + c) / 2;
        double sum = s*(s-a)*(s-b)*(s-c);
        double triangle = sqrt(sum);
        double rectangle = a * b;
        double circle = pi * r * r;

        // print area
        switch(figure){
            case "triangle" -> System.out.println("The area of the triangle room is " + triangle);
            case "rectangle" -> System.out.println("The area of the rectangle room is " + rectangle);
            case "circle" -> System.out.println("The area of the circle room is " + circle);
            default -> System.out.println("We do not calculate such shape");
        }
    }


}