import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorForm extends JFrame implements ActionListener {

    JButton btnBlue = new JButton("Blue");
    JButton btnRed = new JButton("Red");
    JButton btnGreen = new JButton("Green");

    public ColorForm() {
        setTitle("This form is colored");
        setSize(500,300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(btnBlue);
        add(btnGreen);
        add(btnRed);

        JButton [] btnArray = new JButton[] {btnBlue,btnRed,btnGreen};

        for (JButton eachButton : btnArray) {
            eachButton.setFont(new Font("Verdana",Font.BOLD,22));
            eachButton.setForeground(Color.black);

            eachButton.setPreferredSize(new Dimension(150,50));
            eachButton.addActionListener(this);

        }
        btnRed.setBackground(Color.RED);
        btnGreen.setBackground(Color.GREEN);
        btnBlue.setBackground(Color.BLUE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnRed)
            getContentPane().setBackground(Color.RED);
        else if (e.getSource() == btnBlue)
            getContentPane().setBackground(Color.BLUE);
        else if (e.getSource() == btnGreen)
            getContentPane().setBackground(Color.GREEN);
    }
}