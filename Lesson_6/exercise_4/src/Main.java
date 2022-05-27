import java.util.Scanner;

/*Write a program that reads an array of ints and outputs
the length of the longest sequence in strictly ascending order.
Elements of the sequence must go one after another. A single
number is assumed to be an ordered sequence with the length = 1.
Input data format:
    The first line contains the size of an array.
    The second line contains elements of the array separated by spaces.
Example:
    The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the
    longest sequence
    in ascending order is 5. It includes the following elements: 1 2 3 5 7*/

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        int longSeque = 0;
        int finalSequence = 1;

        for (int i = 1; i < array.length; i++) {
            int previous = array[i-1];
            int current = array[i];

            if(previous < current){
                longSeque++;

                if(longSeque > finalSequence){
                    finalSequence++;
                }
            }
            else{
                longSeque = 1;
            }
        }
        System.out.println(finalSequence);
    }
}