/*Create an abstract class Parent with an abstract method message.
* It has two subclasses each having a method with the same name message
* that prints "This is second subclass" respec.
* Call the methods message by creating an object for each
* subclass.*/
public class Main {
    public static void main(String[] args) {
        Subclass1 sub1 = new Subclass1();
        Subclass_2 sub2 = new Subclass_2();

        sub1.message();
        sub2.message();
    }
}