import java.util.Scanner;
/*N squirrels found K nuts and decided to divide them equally. Determine how many
        nuts each squirrel will get. So there are two positive numbers N and K, each of them is
        not greater than 10000.*/
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        System.out.println(k / n);
    }
}