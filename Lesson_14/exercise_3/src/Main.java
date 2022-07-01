/*     You have an abstract class Shape with two abstract methods: getPerimeter() and
    getArea(). See the provided code template.
    You need to declare and implement three classes: Triangle, Rectangle, and
    Circle. The classes must extend the Shape class and implement all abstract methods.
    To implement the methods the standard class Math may help you.
      ● The class Triangle must have a constructor with three double arguments for
    setting the length of each side. To calculate the area of this shape you may use
    Heron's formula.
      ● The class Rectangle must have a constructor with two double arguments for
    setting the length of different sides.
      ● The class Circle must have a constructor with one double argument for setting
    the radius. You may use Math.PI as the PI constant or you can declare it yourself.
    Examples
        A circle has a radius = 10: perimeter = 62.831853..., area = 314.159265....
        A triangle has three sides a = 3, b = 4 and c = 5: perimeter = 12.0, area = 6.0.
        A rectangle has two different sides a = 5, b = 10: perimeter = 30.0, area = 50.0.
*/
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(3,4,5);
        Rectangle rectangle = new Rectangle( 5, 10 );

        Shape arr[] = { circle, triangle, rectangle};

        for (Shape shape : arr) {
            System.out.println(shape.getClass() + " area : " + shape.getArea());
            System.out.println(shape.getClass() + " perimeter : " + shape.getPerimeter());
        }
    }
}