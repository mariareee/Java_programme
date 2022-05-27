import java.util.Scanner;

/*Task: write a program that reads an array of ints and an
integer number n.The program must sum all the array elements
greater than n.
Input data format:
    The first line contains the size of an array.
    The second line contains elements of the array separated by spaces.
    The third line contains the number n.
Output data format:
       Only a single number represents the sum.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce the size of the array:");
        int n = scan.nextInt();
        int[] array = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Input the the values:");
            array[i] = scan.nextInt();
            sum += array[i];
        }
        System.out.println("The sum is:" + sum);
    }
}