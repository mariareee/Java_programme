public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    // override the method here
    @Override
    public double area() {
        return height * width;
    }
}