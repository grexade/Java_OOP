import javax.swing.*;

public class ShapesRun {
    public static void main(String[] args) {

        Square sq = new Square(5);
        Rectangle rec  = new Rectangle(2,4);
        Circle cir = new Circle(5);

        sq.setShapeName("Square");
        rec.setShapeName("Rectangle");
        cir.setShapeName("Circle");

        Shapes [] shapesArray = {sq, rec, cir};
        String output = "";

        for (Shapes eachShape : shapesArray){
            output += "Shape name :" + eachShape.getShapeName()+"\n";
            output+="Shape area: " + eachShape.calculateArea()+"\n";
            output+= "Shape Perimeter "+ eachShape.calculatePerimeter()+"\n";
            output+="\n";
        }

        JOptionPane.showMessageDialog(null, output);
    }
}
