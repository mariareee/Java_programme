import java.util.Scanner;

/*Task : Write a program that takes the input of two integers:
    the beginning and the end of the interval (both numbers belong to
    the interval).The program should output the numbers from this interval,
     but if the number is divisible by 3, you should output Fizz
     instead of it; if the number is divisible by 5, output
    Buzz; and if it is divisible both by 3 and by 5, output
    FizzBuzz.Output each number or the word on a separate line.*/
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();;
        int end = scan.nextInt();

        for (int i = start; i <= end; i++) {

            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println( i + " ");
            }
        }
    }
}