public class Main {
    public static void main(String[] args) {

       //----Testing the workability w DATA ---//
        Shape shape = new Shape();
        Circle circle = new Circle(8);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(5, 4);
        Square square = new Square(3);

        printAreaOfShape(square);
        printAreaOfShape(rectangle);
        printAreaOfShape(circle);
        printAreaOfShape(triangle);
    }

    public static void printAreaOfShape(Shape shape) {
        System.out.println(shape.area());
    }

}