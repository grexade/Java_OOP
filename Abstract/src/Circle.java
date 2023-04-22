public class Circle extends Shapes{

    private double PI = 3.14;

    Circle(int r){
        super(r);
    }

    @Override
    public double calculateArea() {
        double area = PI *r*r;
        return area;
    }

    @Override
    public double calculatePerimeter() {
       double perimeter = 2*PI*r;
        return perimeter;
    }
}
