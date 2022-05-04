public class Main {

/*    Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits.*/
    public static void main(String[] args) {

        int n = 345; //can be any three digit number
        int sum = ( n / 100) + (n / 10 ) %10 + n % 10;

        System.out.println(sum);
    }
}