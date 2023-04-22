public class Person {

    protected int age;
    protected String name;

    Person(int a, String n){
        this.age = a;
        this.name = n;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void birthday(){
        this.age = this.age + 1;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
