
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


    public class Form1 extends JFrame implements ActionListener{

        private JTextField txtFirstName = new JTextField(15);
        private JTextField txtSurname = new JTextField(15);
       // private JTextField txtAbout = new JTextField(30);

        private JCheckBox myChkOOP = new JCheckBox("Object Oriented Prog.");
        private JCheckBox myChkOS = new JCheckBox("Operating systems");
        private JCheckBox myChkSp = new JCheckBox("System programming    ");

        private JLabel lblFirstName = new JLabel("Your name*    :");
        private JLabel lblSurname = new JLabel("Your surname*:");
        private JLabel lblGender = new JLabel("Your Gender*: \r\n");
        private JLabel lblNationality = new JLabel("Your Nationality*:");
        private JLabel lblAbout = new JLabel("     About You:     ");
        private JLabel lblChoice = new JLabel("Lectures you are taking right now :");
        private JLabel lblCompulsory = new JLabel("      * compulsory fields");


        private JButton btnClear = new JButton("Clear");
        private JButton btnSubmit = new JButton("Submit");

        private ButtonGroup gender = new ButtonGroup();
        private JRadioButton radioMen = new JRadioButton("Men");
        private JRadioButton radioWomen = new JRadioButton("Women");


        private String [] countries = {"Nigeria","Turkey","Cyprus","Germany","Spain","Canada"};
        private JComboBox countryBox = new JComboBox(countries);

        private JTextArea myTextArea = new JTextArea(5,20);

        public JTextField getTxtFirstName() {
            return txtFirstName;
        }

        public Form1() {
            setMinimumSize(new Dimension(330,420));
            setResizable(false);
            setLayout(new FlowLayout());
            setTitle("Enter Info");
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            add(lblFirstName);
            add(txtFirstName);
            add(lblSurname);
            add(txtSurname);

            add(lblGender);
            add(radioWomen);
            add(radioMen);
            gender.add(radioMen);
            gender.add(radioWomen);

            add(lblNationality);
            add(countryBox);

            add(lblAbout);
            add(myTextArea);


            add(lblChoice);
            add(myChkOOP);
            add(myChkOS);
            add(myChkSp);

            lblCompulsory.setForeground(Color.RED);
            add(lblCompulsory);
            add(btnSubmit);
            add(btnClear);


            btnClear.addActionListener(this);
            btnSubmit.addActionListener(this);

            this.setVisible(true);
        }

        public static void main(String[] args)
        {


           Form1 f1 = new Form1();
        }


        @Override
        public void actionPerformed(ActionEvent ae) {

            if (ae.getSource() == btnSubmit){

                String gender = "";
                String lectures= "";
                if(txtSurname.getText().length()<1 && txtFirstName.getText().length()<1)
                    JOptionPane.showMessageDialog(this, "Please enter your name", "Error",JOptionPane.ERROR_MESSAGE);
                else if ((radioMen.isSelected()==false) && (radioWomen.isSelected()==false))
                    JOptionPane.showMessageDialog(this, "Please select a gender", "Error",JOptionPane.ERROR_MESSAGE);


                else{

                    if(radioWomen.isSelected())
                        gender = "female";
                    else if (radioMen.isSelected())
                        gender = "male";

                    if (myChkOOP.isSelected())
                        lectures += "\n Object Oriented Prog \n" ;
                    if (myChkOS.isSelected())
                        lectures += "\n Operating Systems \n";
                    if (myChkSp.isSelected())
                        lectures += "\n System Programming \n";

                Form2 f2 = new Form2();
                Form2.infoName.setText(txtFirstName.getText());
                Form2.infoSurname.setText(txtSurname.getText());
                Form2.infoGender.setText(gender);
                Form2.infoNationality.setText(countryBox.getSelectedItem().toString());
                Form2.infoProfile.setText(myTextArea.getText());
                Form2.infoLectures.setText(lectures);

               // Form2.
                }
            }
            else if (ae.getSource() == btnClear){
                txtFirstName.setText("");
                txtSurname.setText("");
                gender.clearSelection();
                countryBox.setSelectedIndex(-1);
                myTextArea.setText("");
                myChkOOP.setSelected(false);
                myChkOS.setSelected(false);
                myChkOOP.setSelected(false);
            }
        }


    }

