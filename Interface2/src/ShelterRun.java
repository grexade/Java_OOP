import javax.swing.*;

public class ShelterRun {
    public static void main(String[] args) {

        Owner Jack = new Owner("Jack Black");
        String output = "";

        Dog Max = new Dog("Golden Retriever", 5);
        Max.setName("Max");
        Max.setOwner(Jack);
        Max.adoptionCompleted();
        Max.eat("Dog Biscuits");
        Max.sleep(7);
        Max.move("home", "park");

        output += "\n Dog Name: "+Max.getName();
        output += "\n Dog Breed: "+Max.getBreed();
        output += "\n Dog Age: "+Max.getAge();
        output += "\n Owner: "+Max.getOwnerName();

        JOptionPane.showMessageDialog(null, output);
    }
}
