public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(double width, double height ){
        this.width = width;
        this.length = height;
    }

    @Override
    public double getPerimeter(){
        return 2 * (width + length);
    };

    @Override
    public double getArea(){
        return width * length;
    };
}
