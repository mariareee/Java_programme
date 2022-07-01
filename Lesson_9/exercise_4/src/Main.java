import java.util.Arrays;
import java.util.Scanner;

/*The class Arrays includes a lot of useful methods for processing arrays. O
ne of them is the binarySearch method. It allows you to quickly find the index
of an element in the given ordered array.
You just need to pass the given parameters in the same order to this method.
In the main class get an array of 10 integers with a Scanner and one more integer to
find the position of. Use binarySearch method to find its position in the array. Don’t
use imports in this exercise.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrSize = 10;
        System.out.println("Introduce an array with 10 values : ");
        int[] array = new int[arrSize]; // all the 10 numb of arr


        for (int i = 0; i < array.length ; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Introduce an number of which you want to know the index: ");
        int n = scan.nextInt();

        int value = java.util.Arrays.binarySearch(array,n); // finds an index in array
        System.out.println("The index is : " + value);
        // 0 1 2 3 4 5 6 7 8 9 find index: 5 -> 5 (but it has to be sorted)
    }
}