/*
    Suppose, you are writing a geometric engine. Now it includes classes Circle,
Rectangle and interfaces Movable and Scalable.

IMPLEMENTATIONS NEEED:
    ● to write a new interface MutableShape that extends both existing interfaces;
    ● to implement the new interface in each class;
    ● to override methods move and scale in both classes:
    ○ scale should multiply the radius of a circle by the specified factor;
    ○ scale should multiply width and height of a rectangle by the specified
factor;
    ○ move should add dx and dy to the center of a circle;
    ○ move should add dx and dy to the upper-left corner of a rectangle.
 See the provided code and read comments to understand your task better. Now the
code is not compiled.
 After your changes, the following code should be compiled:
  MutableShape circle = new Circle(2.0f, 3.5f, 10.1f);
        circle.move(10.1f, 20.2f);
        circle.scale(2.2f);
        ((Circle) circle).getRadius();
*/
public class Main {
    public static void main(String[] args) {

        MutableShape circle = new Circle(2.0f, 3.5f, 10.1f);
        circle.move(10.1f, 20.2f);

        circle.scale(2.2f);
        Circle circle1 = (Circle) circle;
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getCenterY());

    }
}