public class Dog extends Pet {
    private String name;

    public Dog(String breed, int age){
        super(breed, age);
    }

    @Override
    public void adoptionCompleted() {
        System.out.println(this.name + " is adopted by "+getOwnerName());
    }

    @Override
    public void move(String from, String to) {
        System.out.println(this.name + " runs from "+from + " to "+to);
    }

    @Override
    public void eat(String food) {
        System.out.println(this.name + " eats "+food);
    }

    @Override
    public void sleep(int hours) {
        System.out.println(this.name + " sleeps "+hours + " per day ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
