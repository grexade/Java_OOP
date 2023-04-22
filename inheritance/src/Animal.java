public class Animal {

    protected int age;
    protected boolean isDomestic;
    protected String breed;

    public Animal(){}

    public Animal(int a, boolean isD){
        this.age =a;
        this.isDomestic =isD;
    }

    public void setAge(int a){
        this.age=a;
    }
    public int getAge(){
        return this.age;
    }

    public void setIsDomestic(boolean isD){
        this.isDomestic=isD;
    }

    public boolean getIsDomestic(){
        return this.isDomestic;
    }

    public void setBreed(String b){
        this.breed=b;
    }

    public String getBreed(){
        return this.breed;
    }

    public void move (){
        System.out.println("Animal Moves");
    }
}
