public class RunClass {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5,7);
        Rightangled t = new Rightangled(2,4,6);

        c.setName("Circle");
        r.setName("Rectangle");
        t.setName("Right Angled Triangle");

        Shapes [] shapesArray = {c,r,t};

        for (Shapes eachShape : shapesArray){
            System.out.println("Shape Name: " + eachShape.getName());
            System.out.println("Shape Area: " + eachShape.calculateArea());
            System.out.println("Shape Perimeter: " + eachShape.calculatePerimeter());
            System.out.println("\n");
        }

    }
}
