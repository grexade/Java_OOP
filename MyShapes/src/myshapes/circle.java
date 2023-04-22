package myshapes;

import javax.swing.*;
import java.util.PrimitiveIterator;

public class circle {

    private int r;
    private final double PI =3.14;
    private double area = 0;
    private double perimeter = 0;

    public circle(int radius) {
        this.r = radius;
    }

    public double calculateArea(){

        area = PI * r * r;
        return area;
    }

    public double calculatePerimeter(){

        perimeter = 2 * PI * r;
        return perimeter;
    }

}
