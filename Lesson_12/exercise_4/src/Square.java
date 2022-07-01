public class Square extends Shape {
    double side;
// override the method here
    Square(double side){
        this.side = side;
    }
    @Override
    public double area() {
        return side * side;
    }
}