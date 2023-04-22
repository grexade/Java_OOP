import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm extends JFrame implements ActionListener {

    private JButton btnInfo = new JButton("Info Form");
    private JButton btnDisplay = new JButton("Display");
    private JButton btnAbout = new JButton("About");
    String number;

    public mainForm(String username,String role){

        setMinimumSize(new Dimension(180,200));
        setResizable(false);
        setLayout(new FlowLayout());
        setTitle("Main Form");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(btnInfo);
        add(btnDisplay);
        add(btnAbout);

        username = number;
        if(role.equals("student")){
            btnInfo.setEnabled(false);
        }
        btnAbout.addActionListener(this);
        btnDisplay.addActionListener(this);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnDisplay){
            aboutForm A1 = new aboutForm(number);
        }
    }
}
