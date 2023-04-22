import javax.swing.*;

public class Engineer {

    private String name;
    private double salary;
    private int age;
    private String jobTitle;

    public Engineer(String n, int a){
        this.name = n;
        this.age =a;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double addBonusToSalry(double bonus){
        this.salary+=bonus;
        return salary;
    }
    public double showSalary(){
        JOptionPane.showMessageDialog(null, salary);
        return salary;
    }




}
