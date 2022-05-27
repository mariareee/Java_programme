import java.util.Scanner;
/*TASK : Write a program that prints the product of all
integer numbers from a to b (a < b).
Include a and exclude b from the product.
If you input 1 and 3 it should calculate 1 *
2 * 3.*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        double prod = 1;

        for (int i = a; i < b ; i++) {
            prod *= i;
        }
        System.out.println(prod);
    }
}