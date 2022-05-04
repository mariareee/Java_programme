/*write a program that reads three double values
  a, b, c and then solving the simplest equation :
  a * x + b = c .The program should output the
  value of x. It's guaranteed, a is not 0. */

import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        double a = 2;
        double b = -1;
        double c = 2 ;

        double x = (c - b) / a;

        System.out.println(x);
    }
}