/*Write a method that has an int argument and computes
the sum of all numbers from
1 to n. Try to make it using recursion.
*/
import java.util.Scanner;
public class Main {
    
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = sum(scanner.nextInt());
        System.out.println(sum);
    }
    public static long sum(int s) {
        if( s < 1){    //1
            return s;  //sum = 1
        }
        return s + sum( s - 1); // in other case ->  3 (1,2,3 , but it sums only)-> 1 + 2 = 3
    }
}