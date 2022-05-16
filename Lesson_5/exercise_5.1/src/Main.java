/*5.1 Write a program that reads an integer number and prints YES if it is positive.
 Otherwise, the program should print no
 *do not forget that zero is not a positive number*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce any integer number: ");
        int number = scanner.nextInt();

        if(number <= 0){
            System.out.println("NO");
        }
        else{
            System.out.println( "YES");
        }
    }
}