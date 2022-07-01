public class Triangle extends Shape {
    double height;
    double base;
// override the method here
    Triangle(double height, double base){
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        return (base * height) / 2 ;
    }
}