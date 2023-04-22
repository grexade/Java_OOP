public abstract class Shapes {

    protected int r;
    protected int a,b,c;
    protected String name;
    
    Shapes(int r){
        this.r=r;
    }
    Shapes(int a, int b){
        this.a=a;
        this.b =b;
    }
    Shapes(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

}
