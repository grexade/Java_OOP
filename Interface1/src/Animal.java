public abstract class Animal {

    int age;
    String breed;
    Animal(int age, String breed){
        this.age=age;
        this.breed=breed;
    }

    public abstract void sleep();
    public abstract void run();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
