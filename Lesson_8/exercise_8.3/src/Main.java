/*Write a method named getFirstAndLast.The method should take an
* array of ints and return a new array of ints.The returned array
* must contain two elements: the first and the last elements of the
* input array.
* */
import java.util.*;
public class Main {

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }

    public static int[] getFirstAndLast(int[] array){

        int lastNumber = array.length - 1; //our last numn=ber in arr

        int[] anotherArr = new  int[2];
        anotherArr[0] = array[0];
        anotherArr[1] = array[array.length - 1];

        return anotherArr;

        /*return new int[] {array[0] , array[lastNumber]};*/ // ret first and last -> THE SHORT WAY
        }

    }
