public class FeesCalculation {
    private int homeStudentFee = 600; //TL
    private int internationalStudentFee = 2000; //TL
    private String fullName;
    private int numberOfCourses=0;
    private double totalFees = 0;
    private boolean isStudentHome = false;

    public FeesCalculation(String fullName, int numberOfCourses, boolean isStudentHome) {
        this.fullName = fullName;
        this.numberOfCourses = numberOfCourses;
        this.isStudentHome = isStudentHome;
    }
    public double calculateTotalFee(){
        int pricePerCourse=0;
        if (this.isStudentHome)
            pricePerCourse = homeStudentFee;
        else
            pricePerCourse = internationalStudentFee;

        totalFees = pricePerCourse * numberOfCourses;
        return totalFees;
    }
}