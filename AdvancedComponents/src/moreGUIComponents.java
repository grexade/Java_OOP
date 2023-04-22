import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class moreGUIComponents extends JFrame implements ActionListener {

    JButton btnSubmit = new JButton("submit");
    JButton btnClear = new JButton("clear");
    JLabel labelInfo = new JLabel("Please select your department:");
    JLabel labelDept = new JLabel();
    String [] departments = {"Information System Enineering","Computer Enineering", "Software Engineering",
    "Artificial Intelligence Engineering"};
    JComboBox departmentCombo = new JComboBox(departments);

    public moreGUIComponents() throws HeadlessException{
        setMinimumSize(new Dimension(400,400));
        setResizable(false);
        setLayout(new FlowLayout());
        setTitle("More GUI Componets");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        add(labelInfo);
        add(departmentCombo);
        add(btnSubmit);
        add(labelDept);
        add(btnClear);

        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);
        //labelDept.setFont(new Font("Tahoma", Font.BOLD))

        setVisible(false);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    if(e.getSource() == btnSubmit){
        String selectedDept = this.departmentCombo.getSelectedItem().toString();
        labelDept.setText(selectedDept);
    }

    else if (e.getSource() == btnClear){

        this.departmentCombo.setSelectedIndex(0);
        this.labelDept.setText("");
    }
    }
}
