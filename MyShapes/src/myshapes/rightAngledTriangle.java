package myshapes;

public class rightAngledTriangle {
    private int base,height,hypotenuse;
    private double area;
    private int perimeter;

    public rightAngledTriangle(int b, int h, int hyp) {
        this.base = b;
        this.height = h;
        this.hypotenuse = hyp;
    }

    public double calculateArea(){

        area = (base * height) / 2.0;
        return area;
    }

    public int calculatePerimeter(){
        perimeter = base + height + hypotenuse;
        return perimeter;
    }
}
