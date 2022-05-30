/*Task: Implement a method sumInRange for calculating the sum
* of numbers in the range from(inclusive), to(exclusive)*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce the first number: ");
        int a = scan.nextInt();
        System.out.println("Introduce the second number: ");
        int b = scan.nextInt();

       sumInRange(a, b);
    }

    public static void sumInRange(int a,int b){
        int sum = 0;
        for (int i = a; i < b; i++) {
            sum += i ;
        }
        System.out.println("The sum is: "+ sum);
    }
}

