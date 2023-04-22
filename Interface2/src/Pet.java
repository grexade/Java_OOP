public abstract class Pet implements DomesticAnimal {
    protected int age;
    protected String breed;
    protected Owner owner;


    public Pet(String breed, int age){
        this.age=age;
        this.breed=breed;
    }

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

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getOwnerName(){
        return this.owner.getName();
    }

    public int birthday(){
        return age+1;
    }

    public abstract void adoptionCompleted();
}
