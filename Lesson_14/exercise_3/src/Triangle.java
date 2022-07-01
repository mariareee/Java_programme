public class Triangle extends Shape{
    double side_a;
    double side_b;
    double side_c;

    public Triangle(double side_a, double side_b,double side_c){
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }
    @Override
    public double getPerimeter(){
        return side_a + side_b + side_c ;
    };
    @Override
    public double getArea(){
        double s;
        double area;

        s =  (side_a + side_b + side_c) / 2;
        area = Math.sqrt(s * (s - side_a) * ( s - side_b) * (s - side_c));
        return area;
    };
}
