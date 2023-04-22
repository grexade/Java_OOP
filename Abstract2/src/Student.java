public class Student extends Person{

    String schoolName;

    public Student(String n, int a, double l){
        super(n,a,l);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    public int calculateBirthYear(){
       return currentYear-age;
    }
    @Override
    public double calculateWeeklyIncome() {
        return 7*allowance;
    }

    @Override
    public double calculateMonthlyIncome() {
        return 30 * allowance;
    }
}
