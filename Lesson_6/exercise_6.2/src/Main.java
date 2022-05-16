/* Write a program that calculates the sum of the elements of an array of ints.
 * Input data format
 *     The first line contains the size of an array.
 *     The second line contains elements of the array separated by spaces
 * Output data format
 *     The sum of the input array elements.
 * */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Insert the array size: ");
        int n =sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print(" Insert a number: ");
            array[i]= sc.nextInt();

            sum+=array[i];
        }
        System.out.println(sum);


    }
}