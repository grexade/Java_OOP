public class TestStudent {
    public static void main(String[] args) {

        Person anon = new Person();
        anon.setName("Mike");
        anon.setAge(23);
        anon.register();
        Person helen = new Person("helen", 19);
        helen.register();

        System.out.println("\n");

        Student jagaban = new Student();
        jagaban.setName("Jagaban");
        jagaban.setAge(23);
        jagaban.setMark(100);
        jagaban.study(5);
        jagaban.register();

        System.out.println("\n");
        Student obasanjo = new Student("Obasanjo", 20, 100);
        obasanjo.register();

        System.out.println("\n");

        Undergraduate ade = new Undergraduate();
        ade.setName("ade");
        ade.setAge(25);
        ade.setMark(100);
        ade.setYear(2021);
        ade.setProg("Information System Engineering");
        ade.register();

        System.out.println("\n");

        Undergraduate Olu = new Undergraduate("Olu", 22, 100,
                "Information Systems Enginnering", 2021);
        Olu.register();


    }
}
