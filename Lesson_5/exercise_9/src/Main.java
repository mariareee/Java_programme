import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sumlength = 0;

        int number;
        do {
            number = sc.nextInt();
            if (number != 0) {
                sumlength++;
            }

        } while (number != 0);
        System.out.println(sumlength);
    }
}