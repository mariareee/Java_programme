/*Task : Harry Potter needs help identifying what each house means.
        Read a string representing a house and output the following:
         if it is "gryffindor", output "bravery";
         if it is "hufflepuff", output "loyalty";
         if it is "slytherin", output "cunning";
         if it is "ravenclaw", output "intellect";
         otherwise, output "not a valid house".*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String houseClan = scan.next();

        switch(houseClan){
            case "gryffindor" -> System.out.println("bravery");
            case "hufflepuffle" -> System.out.println("loyalty");
            case "slytherin" -> System.out.println("cunning");
            case "ravenclaw" -> System.out.println("intellect");
            default -> System.out.println("Not a valid house");
        }
    }
}