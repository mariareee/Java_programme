/*Use method nextLine from Scanner class to read the whole line of input.
* The trick is to use Scanner class without the import statement.
* So you need to have a method getString() that return a String, inside that method
* add the logic. */
public class Main {
    public static void main(String[] args) {
        String sc = getString();
        System.out.println(sc);
    }
    public static String getString(){
        java.util.Scanner sc = new java.util.Scanner(System.in);
       return sc.nextLine();
    }
}