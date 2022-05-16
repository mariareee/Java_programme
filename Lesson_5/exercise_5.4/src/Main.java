/*Read a sequence of integer numbers(which ends with number 0)
* .Find the largest element of the sequence.
* The number 0 itself is not included in the sequence but serves
* only as a sign of the sequence's end*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number;
        int max = -214748;

        do{
            number = scanner.nextInt();
            if(number > max){
                max = number;
            }
        }while( number != 0);

        System.out.println("The maximum number is " + max);
    }
}