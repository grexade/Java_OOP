import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Presentation Tier
public class GUIForm extends JFrame implements ActionListener {
    JTextField txtFullName = new JTextField(25);
    JComboBox comboNumberOfCourses = new JComboBox();
    JTextField txtFees = new JTextField(6);
    JLabel labelFullName = new JLabel("Enter your name :");
    JLabel labelFees = new JLabel("Total fees you need to pay :");
    JLabel labelCourses = new JLabel("Select the number of courses you want to take :");
    JRadioButton radioHome = new JRadioButton("Home Student");
    JRadioButton radioOversea = new JRadioButton("Overseas Student");
    JButton btnSubmit = new JButton("Submit");
    JButton btnClear = new JButton("Clear");
    ButtonGroup radioGroup = new ButtonGroup();
    public GUIForm() throws HeadlessException {
        setTitle("Fill all of the information below please");
        setMinimumSize(new Dimension(500,400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setResizable(false);
        for (int i =1; i<=8; i++)
            comboNumberOfCourses.addItem(""+i);
        radioGroup.add(radioHome);
        radioGroup.add(radioOversea);
        add(labelFullName);
        add(txtFullName);
        add(radioHome);
        add(radioOversea);
        add(labelCourses);
        add(comboNumberOfCourses);
        add(btnSubmit);
        add(labelFees);
        add(txtFees);
        add(btnClear);
        txtFees.setEnabled(false);
        txtFees.setText("0.00 TL");
        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
    }

    public static void main(String[] args) {
        GUIForm G1 = new GUIForm();
        G1.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit){
            String fullName = this.txtFullName.getText().toString();
            String numberOfCoursesStr =
                    this.comboNumberOfCourses.getSelectedItem().toString();
            boolean isHome = false;
            int numberOfCourses = 0;
            if (radioHome.isSelected())
                isHome = true;
            else if (radioOversea.isSelected())
                isHome = false;
            try {
                numberOfCourses = Integer.parseInt(numberOfCoursesStr);
            }catch (Exception ex){
                JOptionPane.showMessageDialog(this, "Some error happened in your course selection, try again");
                        System.out.println(ex.getMessage());
            }
            /*Call to Business Tier START*/
            FeesCalculation fee = new
                    FeesCalculation(fullName,numberOfCourses,isHome);
            txtFees.setText(""+fee.calculateTotalFee()+" TL");
            /*Call to Business Tier END*/
            txtFees.setForeground(Color.BLACK);
            txtFees.setEnabled(true);
        }
        else if (e.getSource() == btnClear){
            txtFees.setEnabled(false);
            txtFees.setText("0.00 TL");
            txtFullName.setText("");
            radioGroup.clearSelection();
            comboNumberOfCourses.setSelectedIndex(0);
        }
    }
}