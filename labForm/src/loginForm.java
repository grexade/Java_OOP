import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginForm extends JFrame implements ActionListener {
    private JLabel lblUser = new JLabel("Username");
    private JLabel lblPass = new JLabel("Password");
    private JTextField txtUser = new JTextField(10);
    private JTextField txtPass = new JTextField(10);

    private ButtonGroup users = new ButtonGroup();
    private JRadioButton radioAdmin = new JRadioButton("Admin");
    private JRadioButton radioStudent = new JRadioButton("Student");

    private JButton btnLogin = new JButton("Login");

    public loginForm(){

        setMinimumSize(new Dimension(220,300));
        setResizable(false);
        setLayout(new FlowLayout());
        setTitle("Login Form");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        users.add(radioAdmin);
        users.add(radioStudent);

        add(lblUser);
        add(txtUser);

        add(lblPass);
        add(txtPass);

        add(radioAdmin);
        add(radioStudent);
        add(btnLogin);
        this.setVisible(true);


        btnLogin.addActionListener(this);
        radioAdmin.addActionListener(this);
    }

    public static void main(String[] args) {
        loginForm l1 = new loginForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnLogin){

        if((txtUser.getText()=="21813079") && txtPass.getText()=="std123" && !radioAdmin.isSelected() ){

        }
            mainForm M1 = new mainForm(txtUser.getText(),"Student");
        }
    }
}
