/*Print the sum of all integers from a to b including both.
* Integer a is always lower the b (a<b)*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce first number:");
        int a = scanner.nextByte();
        System.out.println("Introduce second number:");
        int b = scanner.nextInt();
        int finalSum = 0;

        for (int i = a; i <=b; i++){

            finalSum += i;
        }
        System.out.println(finalSum);
    }
}