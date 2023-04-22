import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener {

    JPanel panel1 = new JPanel(new GridLayout(0,3));
    JPanel panel2 = new JPanel(new GridLayout(0,4));
    JButton[] myButtons = new JButton[10];
    JButton btnClear = new JButton("Clear");
    JTextField numText = new JTextField(25);
    JButton btnSubmit = new JButton("=");
    JButton btnAdd = new JButton("+");
    JButton btnMinus = new JButton("-");
    JButton btnDivide = new JButton("/");
    JButton btnMultiply = new JButton("*");
    JButton btnDelete = new JButton("del");

    int counter =9;
    String value= "";

    calculator (){

        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(600,500));
        setTitle("Calculator Exercise");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        numText.setFont(new Font("Verdana",Font.BOLD, 15));
        numText.setEditable(false);
        panel1.setPreferredSize(new Dimension(300,200));
        panel2.setPreferredSize(new Dimension(300,150));

        panel1.setBorder(BorderFactory.createLineBorder(Color.RED));
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        add(numText);
        add(panel1);
        add(panel2);


        for(JButton b : myButtons){
            b = new JButton(""+ counter);
            b.setName("button" + counter);
            if (counter>0)
                panel1.add(b);
            else
                panel2.add(b);
            --counter;
            b.addActionListener(this);
        }
        panel2.add(btnDelete);
        panel2.add(btnClear);
        panel2.add(btnSubmit);
        panel2.add(btnAdd);
        panel2.add(btnMinus);
        panel2.add(btnMultiply);
        panel2.add(btnDivide);

        btnClear.addActionListener(this);
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnAdd = btnAdd;
    }

    @Override
    public void actionPerformed(ActionEvent action) {



        if(action.getSource() == btnClear) {
            numText.setText("0");
            value = "";
        }
        else {
            value += action.getActionCommand();
            numText.setText(value);
        }


    }
}
