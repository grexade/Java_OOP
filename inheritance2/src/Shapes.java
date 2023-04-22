public class Shapes {

    protected int a;
    protected int b;
    protected String shapeName;

    public Shapes(){}

    public Shapes(int a){
        this.a=a;
    }

    public Shapes(int a, int b){
        this.a=a;
        this.b=b;
    }
    public double calculateArea(){
        return 0;
    }
    public double calculatePerimeter(){
        return 0;
    }

    public void setA(int a){
        this.a=a;
    }
    public void setB(int b){
        this.b=b;
    }
    public int getA(){
        return a;
    }
    public void setShapeName(String n){
        this.shapeName=n;
    }
    public String getShapeName(){
        return shapeName;
    }


}
