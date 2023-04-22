import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        Engineer E1 = new Engineer("Jack", 32);
        E1.setJobTitle("Computer Engineer");
        E1.setSalary(2250);
        E1.setSalary(E1.addBonusToSalry(1000));
        JOptionPane.showMessageDialog(null, E1.getName()+ " whose age is " + E1.getAge()
                + " works as a "+ E1.getJobTitle() + "now has a new salary plus bonus equalling " + E1.showSalary());


       // E1.showSalary();
    }
}
