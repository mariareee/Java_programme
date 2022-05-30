/*Task: there is a method print(String arg).The method outputs the name and its argument
* (in "", cause it's a string).The output format for the string argument
* "test": print("test")
* Overload this method by writing a new method with the same name and two arguments: a string
* and an integer.The new method should print the name and both parameters like:
* print("test",4)*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int number = scan.nextInt();
        print(word, number);
    }
    public static void print(String strArg){
        System.out.println("print(\"" + strArg +"\")");
    }
    public static void print(String strArg, int number){
        System.out.println("print(\"" + strArg +"\""+ "," + number +")");
    }
}