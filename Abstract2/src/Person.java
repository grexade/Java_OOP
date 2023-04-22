import java.util.Calendar;

public abstract class Person {

    protected String fullName;
    protected int age;
    protected double allowance;
    protected double salary;
    protected int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    public Person(){

    }
    public Person(String fName, double sal, int a){
        this.fullName=fName;
        this.salary=sal;
        this.age=a;
    }

    public Person(String fName, int a, double allow){
        this.fullName=fName;
        this.age=a;
        this.allowance=allow;
    }

    public abstract double calculateWeeklyIncome();
    public abstract double calculateMonthlyIncome();
}
