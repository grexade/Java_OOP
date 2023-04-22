
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class LayoutClass extends JFrame implements ActionListener {

    JButton btnSubmit = new JButton("Submit");
    JButton btnClear = new JButton("Clear");
    JTextField userNameText = new JTextField (15);
    JPasswordField passwordText = new JPasswordField (15);
    JLabel userLabel = new JLabel("Enter username : ");
    JLabel pwdLabel = new JLabel("Enter password : ");
    JPanel northPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel userPanel = new JPanel();

    private int counter=0;


    public LayoutClass(String title) throws HeadlessException {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,200);
        setLayout(new BorderLayout());

        userPanel.add(userLabel);
        userPanel.add(userNameText);
        userPanel.add(pwdLabel);
        userPanel.add(passwordText);

        //userPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        userPanel.setPreferredSize(new Dimension (350,60));

        southPanel.add(btnSubmit);
        southPanel.add(btnClear);
        northPanel.add(userPanel);
        add("North",northPanel);
        add(southPanel);

        this.btnClear.addActionListener(this);
        this.btnSubmit.addActionListener(this);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {




        if (ae.getSource() == btnSubmit){

            String username = this.userNameText.getText();
            String password = this.passwordText.getText();

            AdminClass login = new AdminClass("Login to Admin Panel");

            if (counter > 3){

                JOptionPane.showMessageDialog(this,
                        "Sorry, you attempted a false login more than 3 times",
                        "Error",JOptionPane.ERROR_MESSAGE);


            }


            if ((username.equals(login.getAdminUser())) && (password.equals(login.getAdminUser()))){
                login.welcomeLabel.setText("Welcome Admin, you successfully logged in");
                login.setVisible(true);
                setVisible(false);//hide the current form
            }
            else{
                JOptionPane.showMessageDialog(this,
                        "Please type correct username and password",
                        "Error",JOptionPane.ERROR_MESSAGE);
                ++counter;
            }

        }

        else if (ae.getSource() == btnClear){

            this.userNameText.setText("");

            this.passwordText.setText("");
            this.userNameText.requestFocus();
        }

    }

}
