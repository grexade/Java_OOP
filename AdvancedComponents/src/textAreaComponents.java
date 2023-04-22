import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textAreaComponents extends JFrame implements ActionListener {

    JButton btnSubmit = new JButton("submit");
    JButton btnClear = new JButton("clear");
    JLabel labelInfo = new JLabel("Please select the courses you are taking this term:");

    String [] departments = {"Object O Programming","Operating System", "Marketing",
            "Mobile Application","Information Security"};
    JLabel labelInfo2 = new JLabel();

    String courseList = "";
    JComboBox coursesCombo = new JComboBox(departments);
    JTextArea courseListArea = new JTextArea(6, 30);


    public textAreaComponents() throws HeadlessException{
        setMinimumSize(new Dimension(400,400));
        setResizable(false);
        setLayout(new FlowLayout());
        setTitle("More GUI Componets");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        add(courseListArea);

        add(coursesCombo);
        add(labelInfo);
        add(btnSubmit);
        add(btnClear);

        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
        //labelDept.setFont(new Font("Tahoma", Font.BOLD))

        setVisible(false);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnSubmit){
            courseList += this.coursesCombo.getSelectedItem().toString()+"\n";

            if(this.coursesCombo.getSelectedObjects() == coursesCombo.getSelectedItem()){
                JOptionPane.showMessageDialog(null, "you have selected this before");
            }
            else
            courseListArea.setText(courseList);
        }

        else if (e.getSource() == btnClear){

            courseListArea.setText("");
            this.coursesCombo.setSelectedIndex(0);

        }
    }
}
