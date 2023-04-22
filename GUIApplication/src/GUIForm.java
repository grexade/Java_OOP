import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class GUIForm extends JFrame implements ActionListener {

    JLabel nameLabel = new JLabel("Please enter your name");
    JLabel surnameLabel = new JLabel("Please enter your surname");
    JLabel ageLabel = new JLabel("Please enter your age");

    JTextField nameText = new JTextField(20);
    JTextField surnameText = new JTextField(20);
    JTextField ageText = new JTextField(3);

    JButton btnSubmit = new JButton("Submit");
    JButton btnClear = new JButton("Clear");

    public GUIForm(String title){
        setTitle(title);
        setSize(500,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(nameLabel);
        add(nameText);
        add(surnameLabel);
        add(surnameText);
        add(ageLabel);
        add(ageText);
        add(btnSubmit);
        add(btnClear);

        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnSubmit){
            String name,surname,ageStr ;
            //String output="";
            int age,yearBorn =0;
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            name = nameText.getText().toString();
            surname = surnameText.getText().toString();
            ageStr = ageText.getText().toString();

            try{
                age = Integer.parseInt(ageStr);
                yearBorn = currentYear - age;

                JOptionPane.showMessageDialog(btnSubmit, "\n Hello " + name + " " + surname + " \n it seems " +
                        "like you were born in " + yearBorn);

            } catch (Exception ex){
                JOptionPane.showMessageDialog(this,
                        "Please enter a number to the age field","Error",
                        JOptionPane.ERROR_MESSAGE);
                System.out.println(ex.getMessage());
            }
        }
        else if (e.getSource() == btnClear){
            nameText.setText(""); // empty name text
            surnameText.setText("");
            ageText.setText("");
            nameText.requestFocus(); // starting location of the cursor
        }
    }
}
