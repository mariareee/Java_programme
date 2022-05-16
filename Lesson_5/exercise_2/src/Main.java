import java.util.Scanner;

/*2.The army of units (medium)
        In a computer game, each gamer has an army of units. Write a program
        that will classify the army corresponding to the following rules:
        less than 1: no army
        from 1 to 19: pack
        from 20 to 249: throng
        from 250 to 999: zounds
        1000 and more: legion
        The program should read the number of units and output the corresponding
        category.
        Sample Input 1: 5
        Sample Output 1: pack
        Sample Input 2: 303
        Sample Output 2: zounds*/
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce your unit of army number : " );
        int unit_per_army = s.nextInt();
        System.out.println(unit_per_army);

        if(unit_per_army <= 1){
            System.out.println("No army");
        }
        else if( unit_per_army < 20){
            System.out.println("Pack");
        }
        else if(unit_per_army < 250){
            System.out.println("Throng");
        }
        else if(unit_per_army < 1000){
            System.out.println("Zounds");
        }
        else if(unit_per_army > 1000){
            System.out.println("Legion");
        }
    }
}