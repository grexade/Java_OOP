public class Rectangle extends Shapes{

    public Rectangle(int a, int b){
        super(a,b);
    }

    @Override
    public double calculateArea (){
        return a*b;
    }
    @Override
    public double calculatePerimeter (){
        return 2*(a+b);
    }
}
