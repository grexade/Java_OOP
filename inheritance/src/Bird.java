import javax.swing.*;

public class Bird extends Animal{

    private String bird;

    public Bird(){
        super();
    }

    public String getBreed(){
       return breed;
   }

   public void setBreed(String b){
      this.breed=b;
     }
    @Override
    public void move() {
        JOptionPane.showMessageDialog(null, "bird flies");
    }
}
