public class Dog extends Animal{

    private String breed;
    private String name;

    public Dog(int a, boolean isD){
        super(a, isD);
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(String b){
        this.breed=b;
    }

    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
    public void birthday(){
        this.age+=1;
    }

    @Override
    public void move() {
        System.out.println("dog runs");
    }
}
