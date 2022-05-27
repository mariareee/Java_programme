/*Create two strings, a and b, using the literal, and another two
(c and d) using the keyword new.Compare the strings a with b, a with c,
and c with d using == and using equals method, and output the result.*/
public class Main {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        String d = new String("Hello");

        System.out.println(a == b);//true
        System.out.println(a == c);//false
        System.out.println(c == d);//false
    }
}