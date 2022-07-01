/*You are given a hidden enum named Secret with some constants in uppercase.
Write a program that counts and prints how many constants in the enumeration start
with "STAR". The enum is accessible during testing.*/
public class Main {
    public static void main(String[] args) {
        int counter = 0;

        for (Secret e : Secret.values()) {
            if (e.name().startsWith("STAR")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}