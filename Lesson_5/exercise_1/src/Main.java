import java.util.Scanner;
/*      Ann learned that oversleeping is as bad for your health as not getting enough sleep.
        She decided to follow recommendations and keep track of how many hours she spends
        sleeping.
        You are given three numbers: A, B and H. According to recommendations, one
        should sleep at least A hours per day, but no more than B hours. H is how many hours
        Ann sleeps.
        Task: If Ann sleeps less than A hours, print "Deficiency". If she sleeps more than B
        hours, print "Excess". If her sleep fits the recommendations, print "Normal".
        Input format: three numbers A, B, H, where A is always less than or equal to B.
        Sample Input 1:
        6
        10
        8
        Sample Output 1: Normal*/
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce the least amount of sleep hours : " );
        int a = s.nextInt();
        System.out.println( "Introduce the most amount of hours of sleep :  ");
        int b = s.nextInt();
        System.out.println("Introduce how many Ann should sleep : ");
        int h = s.nextInt();

        System.out.println("The least amount of sleep hours : "  + a);
        System.out.println("The most amount of hours of sleep :  " + b);
        System.out.println("How many Ann should sleep : " + h);

        if(h < a){
            System.out.println("Deficiency");
        }
        else if(h > b){
            System.out.println("Excess");
        }
        else{
            System.out.println("Normal");
        }
    }
}