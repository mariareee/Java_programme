/*You are given an abstract class IntBinaryOperation. It has one abstract
method perform() and two fields representing the operation arguments.
The fields are initialized in the constructor. See the provided code template.
You need to declare and implement two classes representing concrete operations:
Addition and Multiplication. The classes must extend the abstract class and
implement the method perform(). The implementations should work in accordance
with the class name. Do not forget to write two-argument constructors in your
 classes.*/
public class Main {
    public static void main(String[] args) {

        Addition add = new Addition(2,3);
        Multiplication multiply = new Multiplication(2,3);

        System.out.println(add.perform());
        System.out.println(multiply.perform());
        }
    }
