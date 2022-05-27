/*Task:
Write a program, which reads the number of direction
(1 – up, 2 – down, 3 – left, 4 –right, 0 – do not move)
and outputs the text «move up» (or «move down», or «move left»,
or «move right», or «do not move» depending on the entered number).
If it is a number that does not belong to any of the listed directions,
 the program should output: «error!»*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int direction = scan.nextInt();

        switch(direction){
            case 0 -> System.out.println("do not move");
            case 1 -> System.out.println("move up");
            case 2 -> System.out.println("move down");
            case 3 -> System.out.println("move left");
            case 4 -> System.out.println("move right");
            default -> System.out.println("error!");
        }
    }
}