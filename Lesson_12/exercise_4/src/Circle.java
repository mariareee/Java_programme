public class Circle extends Shape {
    double radius;
// override the method here
    Circle( double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * (radius * radius);
    }
}

