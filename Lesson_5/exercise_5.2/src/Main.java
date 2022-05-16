/*Write a program,which reads the number of shape(1-square,2-circle,3-triangle,4-rhombus)
* and prints the text "You have chosen a square"(or circle,or triangle,
* or rhombus, depending on the number)
* if there is a number that does not correspond to any
* of the listed shapes, the program should output: "There is no such shape"*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce a number: ");
        int number = scanner.nextInt();

        switch(number){
            case 1 :
                System.out.println("You have chosen a square");
                break;
            case 2 :
                System.out.println("You have chosen a circle");
                break;
            case 3 :
                System.out.println("You have chosen a triangle");
                break;
            case 4 :
                System.out.println("You have chosen a rhombus");
                break;
            default :
                System.out.println("There is no such shape");
        }
    }
}