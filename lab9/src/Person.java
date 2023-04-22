public class Person {
    protected String name;
    protected int age;

    public Person(){

    }
    public Person(String nameInput, int ageInput){
        this.name=nameInput;
        this.age=ageInput;
    }
    public void setName(String newName){
        this.name=newName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void register(){
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
    }
}
