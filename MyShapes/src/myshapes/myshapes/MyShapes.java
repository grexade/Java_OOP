package myshapes.myshapes;

import myshapes.circle;
import myshapes.rightAngledTriangle;
import javax.swing.JOptionPane;

import javax.swing.*;

public class MyShapes {

    public static void main(String[] args) {

        circle myCircle = new circle(6);
        rightAngledTriangle myTriangle = new rightAngledTriangle(5,4,9);
        Object [] shapes = {myCircle,myTriangle};
        String output="";

        for (Object eachShape : shapes){

            if (eachShape instanceof circle){
                circle c = (circle) eachShape;
                output +=  "\n Circle area = " + c.calculateArea();
                output +=  "\n Circle perimeter = " + c.calculatePerimeter();
            }

            if (eachShape instanceof rightAngledTriangle){
                rightAngledTriangle t = (rightAngledTriangle) eachShape;
                output +=  "\n Right Angled Triangle area = " + t.calculateArea();
                output +=  "\n Right Angled Triangle perimeter = " + t.calculatePerimeter();
            }
        }//for each

        JOptionPane.showMessageDialog(null,output);

        
    }
    }

