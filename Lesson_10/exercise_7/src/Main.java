/*Let's count the cats! Implement a class named Cat and a static method
getNumberOfCats. These are some features of the class:
● The class Cat has two instance fields: string name and int age, and one static int
field counter. The static counter field allows you to know how many cats have
been already created.
● The class should have a constructor for initializing the instance fields. During the
initialization of a new cat, the value of the static field counter should be
incremented. If the counter > 5, the message "You have too many cats" must
be printed out in the System.out.
Your static method getNumberOfCats should return the current number of created
cats and print no messages.
Take a look at the example: Let's assume seven instances of the class Cat have
already been created. Then the correctly implemented method
Cat.getNumberOfCats() should return 7. The message "You have too many cats" has
to appear twice.*/

public class Main {
    public static void main(String[] args) {

        System.out.println(Cat.getNumberOfCats());

        Cat c1 = new Cat("Cat", 3);
        System.out.println(Cat.getNumberOfCats());
        Cat c2 = new Cat("Cat", 1);
        Cat c3 = new Cat("Cat", 12);
        Cat c4 = new Cat("Cat", 17);
        System.out.println(Cat.getNumberOfCats());
        Cat c5 = new Cat("Cat", 5);
        Cat c6 = new Cat("Cat", 8);
        Cat c7 = new Cat("Cat", 2);
        System.out.println(Cat.getNumberOfCats());
        Cat c8 = new Cat("Cat", 5);
        System.out.println(Cat.getNumberOfCats());



    }
}