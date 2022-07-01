import java.util.Scanner;

/*POW
* You are given two floating-point numbers: a and b.
* Calculate and output the value of the expression a^b.*/
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce first value : ");
        float a = scanner.nextFloat();
        System.out.print("Introduce second value : ");
        float b = scanner.nextFloat();

        System.out.println("The result is : " + Math.pow(a,b));
    }
}