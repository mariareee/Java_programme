import java.util.Scanner;
/*Write a program that takes a date  string formatted as YYYY-MM-DD as input
* ,then converts and outputs is as MM/DD/YYYY.For instance, the input 2007-02-21
* will result in the following output 07/21/2007*/
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String initialDate = scanner.nextLine();// 2022 05 18

            String[] split = initialDate.split("-");

            String year =  split[0];
            String month = split[1];
            String day =   split[2];

        String resultDate = month + "/" + day + "/" + year;
        System.out.println(resultDate);
    }
}