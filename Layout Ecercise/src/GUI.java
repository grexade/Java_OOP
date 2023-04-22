import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {

    JLabel info = new JLabel("select one or more hobbbies from the boxes given");
    JLabel info2 = new JLabel("select a color below");
    JCheckBox gymCheck = new JCheckBox ("Gym");
    JCheckBox footballCheck = new JCheckBox ("Football");
    JCheckBox netflixCheck = new JCheckBox ("Netflix");
    JLabel labelHobbies = new JLabel();
    JButton btnSubmit = new JButton("Submit");

    String hobbies;

    JRadioButton redBtn = new JRadioButton("Red");
    JRadioButton blueBtn = new JRadioButton("blue");
    JRadioButton greenBtn = new JRadioButton("Green");

    ButtonGroup colorgroup = new ButtonGroup();


    GUI(){

        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(350,200));
        setTitle("GUI Exercise");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        colorgroup.add(redBtn);
        colorgroup.add(greenBtn);
        colorgroup.add(blueBtn);

        add(info);
        add(gymCheck);
        add(footballCheck);
        add(netflixCheck);
        add(labelHobbies);
        add(btnSubmit);
        add(redBtn);
        add(greenBtn);
        add(blueBtn);

        redBtn.addActionListener(this);
        blueBtn.addActionListener(this);
        greenBtn.addActionListener(this);

        btnSubmit.addActionListener(this);
        gymCheck.addActionListener(this);
        footballCheck.addActionListener(this);
        netflixCheck.addActionListener(this);



    }

    @Override
    public void actionPerformed(ActionEvent action) {

        if (action.getSource() == redBtn){
            getContentPane().setBackground(Color.RED);
        }
        else if (action.getSource() == blueBtn){
            getContentPane().setBackground(Color.BLUE);
        }
        else if (action.getSource() == greenBtn){
            getContentPane().setBackground(Color.GREEN);
        }

        hobbies ="";

        if (gymCheck.isSelected())
            hobbies += "Gym";
        if (footballCheck.isSelected())
            hobbies += "Football";
        if (netflixCheck.isSelected())
            hobbies += "Netflix";

        if(action.getSource() == btnSubmit)
            labelHobbies.setText(hobbies);
        labelHobbies.setFont(new Font("Verdana", Font.BOLD, 20));
        labelHobbies.setForeground(Color.BLUE);


    }
}
