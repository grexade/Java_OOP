public class Cat extends Animal implements Mammal, Carnivore{


    Cat (int a, String b){
        super(a,b);
    }

    @Override
    public void sleep() {
        System.out.println(breed + " sleeps");
    }

    @Override
    public void run() {
        System.out.println(breed+ " runs");
    }


    @Override
    public boolean isWarmBlood() {
        return warmBlood;
    }

    @Override
    public void eatMeat() {
        System.out.println(breed+ " eats meat");
    }
}
