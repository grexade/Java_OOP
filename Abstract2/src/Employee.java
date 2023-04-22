public class Employee extends Person{

    String jobTitle;

    public Employee(String n, double s, int a){

        super(n,s,a);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public double calculateYearlyIncome(){
        return 365*salary;
    }

    @Override
    public double calculateWeeklyIncome() {
        return 7*salary;
    }

    @Override
    public double calculateMonthlyIncome() {
        return 30 * salary;
    }
}
