public class RunApp {

    public static void main(String[] args) {
        Dog bobby = new Dog(5, true);
        bobby.setName("Bobby");
        bobby.setBreed("Husky");
        bobby.birthday();

        System.out.println(bobby.getName()+" is "+ bobby.getAge() + " years Old");

        Bird bird = new Bird();
        bird.setBreed("Robin");
        bird.setAge(2);
        bird.setIsDomestic(false);

        bobby.move();
        bird.move();
    }
}
