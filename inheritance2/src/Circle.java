public class Circle extends Shapes{


    private double PI = 3.14;

    public Circle(int r){
        super(r);
    }

    @Override
    public double calculateArea (){
        return PI*a*a;
    }
    @Override
    public double calculatePerimeter (){
        return 2*PI*a;
    }

}
