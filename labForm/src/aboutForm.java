import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aboutForm extends JFrame implements ActionListener {
    JLabel txtAbout = new JLabel();
    JButton txtFirstName = new JButton("Student:");


    public aboutForm(String Username){
        setMinimumSize(new Dimension(250,200));
        setResizable(false);
        setLayout(new FlowLayout());
        setTitle("About Form");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(txtFirstName);
        txtAbout.setText(Username);
        add(txtAbout);
        txtAbout.setText(Username);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
