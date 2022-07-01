/*You are given a class named Box that has three double fields.
* Create an instance method to calculate the volume of the box.
* The method must be named getVolume.It should take no arguments
* and return a double result.*/

public class Main {
    public static void main(String[] args) {
        Box box = new Box(3,4,1);

        System.out.println( "The volume of the box is: " + box.getVolume());
    }
}