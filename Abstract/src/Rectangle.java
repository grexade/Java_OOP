public class Rectangle extends Shapes{

    Rectangle(int a, int b){
        super(a,b);
    }

    @Override
    public double calculateArea() {
        double area = a*b;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2*(a+b);
        return perimeter;
    }

}
