public class Circle extends Shape{
    protected double radius;

    public Circle(double radius){

        this.radius = radius;
    }
    @Override
    public double getPerimeter(){

        return 2 * Math.PI * radius;
    };
    @Override
    public double getArea(){

     return Math.PI * Math.pow(radius, 2);
    };
}
