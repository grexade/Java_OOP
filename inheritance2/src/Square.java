public class Square extends Shapes{

    public Square(int a){
     super(a);
    }

    @Override
    public double calculateArea (){
        return a*a;
    }
    @Override
    public double calculatePerimeter (){
        return a*4;
    }
}
