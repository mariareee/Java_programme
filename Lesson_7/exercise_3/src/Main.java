import java.util.Scanner;

/*Write a program that reads two lines and compares them without
* whitespaces.The program should print true if both lines are equal,
* otherwise - false.*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

       str2 = str2.replace(" ","").trim(); // replaces the space & trims

        System.out.println(str1.equals(str2));
    }
}