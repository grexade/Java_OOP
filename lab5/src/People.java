import javax.swing.*;

public class People {
    public static void main(String[] args) {
        Person P1 = new Person(21, "John");

        Person P2 = new Person();

        P2.setAge(25);
        P2.setName("susan");

        JOptionPane.showMessageDialog(null,"First Person: " + P1.name +" "+ P1.age +
                "\n Second person:" + P2.name +" "+ P2.age);





    }
}
