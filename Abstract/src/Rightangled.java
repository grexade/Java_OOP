public class Rightangled extends Shapes{

    Rightangled(int height, int base, int hyp){
        super(height,base,hyp);
    }

    @Override
    public double calculateArea() {
        double area = 0.5*a*b;
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = a+b+c;
        return perimeter;
    }
}
