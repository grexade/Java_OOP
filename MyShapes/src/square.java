package myshapes.myshapes;

import myshapes.circle;
import myshapes.rightAngledTriangle;
import javax.swing.JOptionPane;

import javax.swing.*;

public class MyShapes {


        circle myCircle = new circle(6);
        MyShapes mySquare = new MyShapes();

        String outputs="";

        outputs += "\n square area= " + t.calculateArea(2,4);
        outputs +=  "\n square perimeter = " + t.calculatePerimeter(4,8);

        JOptionPane.showMessageDialog(null,outputs);


    }
}

