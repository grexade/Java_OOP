import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

    private String employeeName;
    private String employeeSex;
    private String employeePosition;
    private Date employeeDOB;
    private Boolean isFullTime;
    private double hoursWorked;
    private double SPR = 17;
    private double salary;

    public Employee(String name, String gender, String position){
        this.employeeName = name;
        this.employeeSex = gender;
        this.employeePosition = position;
    }

    public void setName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSex(String employeeSex) {
        this.employeeSex = employeeSex;
    }

    public void setPosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public void setDOB(Date DOB) {
        this.employeeDOB = DOB;
    }

    public void setPartTimeHours(double hour){
        this.hoursWorked = hour;
    }

    public void setFullTimeSalary(double s){
        this.salary = s;
    }

    public String getEmployeeDOB() {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(employeeDOB);

    }


}
