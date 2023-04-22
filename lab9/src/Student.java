public class Student extends Person{
    protected int avMark;

    public Student(){
        super();
    }
    public Student(String nameInput, int ageInput, int markInput){
        super(nameInput,ageInput);
        this.avMark=markInput;

    }
    public void setMark(int markIn){
        this.avMark=markIn;
    }
    public void study(int hours){
        avMark += (hours*2);
    }
    @Override
    public void register( ){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Mark is: "+avMark);
    }
}
