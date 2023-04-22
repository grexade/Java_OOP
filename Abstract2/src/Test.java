import javax.swing.*;

public class Test {
    public static void main(String[] args) {

        Employee Jack = new Employee("Jack",70,30);
        Jack.setJobTitle("Computer Engineer");

        Student Suzan = new Student("Suzan", 19,20);
        Suzan.setSchoolName("Cyprus International University");

        JOptionPane.showMessageDialog(null, Suzan.fullName+"\n"+Suzan.getSchoolName()+"\n Weekly Allowance ="
                +Suzan.calculateWeeklyIncome()
        + "\n Monthly Allowance ="+Suzan.calculateMonthlyIncome() + "\n\n"+Jack.fullName+"\n"+Jack.getJobTitle()+"\nWeekly Salary ="
                +Jack.calculateWeeklyIncome()
                + "\n Monthly Salary ="+Jack.calculateMonthlyIncome());
        JOptionPane.showMessageDialog(null, Jack.fullName+"\n"+"Yearly Salary: "+Jack.calculateYearlyIncome()+"\n\n"
                +Suzan.fullName+"\n BirthYear is: "+ Suzan.calculateBirthYear());
    }
}
