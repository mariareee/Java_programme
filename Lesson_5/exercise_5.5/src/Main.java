
/*Write a program that reads a sequence of integer numbers in a loop and
adds up all numbers.If a new number is equal to 0, the  program must stop the loop
and output the accumulated sum.When the sum is equal or exceeded 1000(the barrier
),the program should also stop and output the equal sum - 1000*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce your numbers: " );
        int i = scanner.nextInt();
        int sum = i;

        while(i != 0){
            if( sum >= 1000){
                sum -= 1000;
                break;
            }
           i = scanner.nextInt();
            sum += i;
        }
        System.out.println("The sum is : "+ sum);
        }
}
