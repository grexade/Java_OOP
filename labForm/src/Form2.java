import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Form2 extends JFrame implements ActionListener {

    private JLabel lblName = new JLabel("Name :          ");
    private JLabel lblSurname = new JLabel("Surname :          ");
    private JLabel lblGender = new JLabel("Gender :           ");
    private JLabel lblNationality = new JLabel("Nationality :          ");
    private JLabel lblProfile = new JLabel("Profile :         ");
    private JLabel lblLectures = new JLabel("Lectures :         ");

    public static JLabel infoName = new JLabel();
    public static JLabel infoSurname = new JLabel();
    public static JLabel infoGender = new JLabel();
    public static JLabel infoNationality = new JLabel();
    public static JLabel infoProfile = new JLabel();
    public static JLabel infoLectures = new JLabel();



    private JButton btnReturn = new JButton("Return Back");

    public Form2()
    {
        setMinimumSize(new Dimension(250,400));
        setResizable(false);
        setLayout(new FlowLayout());
        setTitle("Form 2");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(lblName);
        infoName.setForeground(Color.BLUE);
        add(infoName);

        add(lblSurname);
        infoSurname.setForeground(Color.BLUE);
        add(infoSurname);

        add(lblGender);
        infoGender.setForeground(Color.BLUE);
        add(infoGender);

        add(lblNationality);
        infoNationality.setForeground(Color.BLUE);
        add(infoNationality);

        add(lblProfile);
        infoProfile.setForeground(Color.BLUE);
        infoProfile.setSize(1,10);
        add(infoProfile);
        infoProfile.setSize(1,10);

        add(lblLectures);
        infoLectures.setForeground(Color.BLUE);
        add(infoLectures);

        add(btnReturn);

        btnReturn.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnReturn){
            Form1 f1 = new Form1();
            //Form2.EXIT_ON_CLOSE();
        }
    }
}


