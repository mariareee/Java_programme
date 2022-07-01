/*You are given a class named Time.It has three int fields: hours, minutes
and seconds. Override the method in the class to return a string representation
of an object.
ex: 23:59:59, 10:08:05, 01;01:01*/
public class Main {
    public static void main(String[] args) {
        Time time = new Time(10,20,59);
        System.out.println(time.toString());
    }
}