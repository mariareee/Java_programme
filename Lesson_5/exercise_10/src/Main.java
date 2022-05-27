import java.util.Scanner;
/*Given integer N. Print all the squares of natural
numbers, not exceeding N, in ascending order.*/
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i < n ; i++) {
            if (Math.sqrt(i) == (int)Math.sqrt(i))
                System.out.print(i + " ");
        }
    }
}