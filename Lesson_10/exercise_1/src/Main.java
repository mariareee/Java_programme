/*You are given a class named Counter. Write two instance methods:
● inc that increases the value of the field current by one;
● getCurrent that returns the current value;*/
public class Main {
    public static void main(String[] args) {
        Counter count = new Counter(10);

        System.out.println(count.getCurrent()); //10
        count.inc(); // increm by 1 -> 11
        count.inc(); // increm by 1 -> 12
        System.out.println(count.getCurrent());
    }
}