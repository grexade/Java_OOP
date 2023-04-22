public class Undergraduate extends Student{
    protected String prog;
    protected int year;

    public Undergraduate(){
        super();
    }
    public Undergraduate(String nameInput, int ageInput, int markInput, String progInput, int yearInput){

        super(nameInput,ageInput,markInput);
        this.prog=progInput;
        this.year=yearInput;

    }
    public void setProg(String progIn){
        this.prog=progIn;
    }
    public void setYear(int yearIn){
        this.year=yearIn;
    }
    public void study(int hours){
        avMark += ((hours*2)-5);
    }
    public void changeYear(){
        this.year = getYear()+1;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void register( ){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Mark is: "+avMark);
        System.out.println("Prog is: "+prog);
        System.out.println("Year is: "+year);

    }
}
