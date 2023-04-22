import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuExercise extends JFrame implements ActionListener {


    JLabel labelInfo = new JLabel("Please select a choice:");
    JLabel labelInfo2 = new JLabel();

    ImageIcon imageForm = new ImageIcon("/Users/grexade/IdeaProjects/AdvancedComponents/src/davido.jpeg");

    JMenuBar navigationBar = new JMenuBar();
    JMenu foreMenu = new JMenu("form");
    JMenu colorMenu = new JMenu("Color");
    JMenu thisForm = new JMenu("This Form");
    JMenuItem newForm = new JMenuItem("New Form");
    JMenuItem closeForm = new JMenuItem("Close Form");
    JMenuItem colorRed = new JMenuItem("Red");
    JMenuItem colorGreen = new JMenuItem("Green");
    JMenuItem colorBlue = new JMenuItem("Blue");

    JMenuItem closeApplication = new JMenuItem("Exit Application");




    public menuExercise() throws HeadlessException{
        setMinimumSize(new Dimension(600,400));
        setResizable(false);
        setLayout(new FlowLayout());
        setTitle("More GUI Components");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        thisForm.setIcon(imageForm);

        colorMenu.add(colorBlue);
        colorMenu.add(colorRed);
        colorMenu.add(colorGreen);

        thisForm.add(newForm);
        thisForm.add(closeForm);
        foreMenu.add(thisForm);
        foreMenu.add(closeApplication);
        navigationBar.add(foreMenu);
        navigationBar.add(colorMenu);
        setJMenuBar(navigationBar);

        JMenuItem [] myItems = { colorGreen,colorBlue,colorRed,closeApplication,closeApplication,newForm};
        for (JMenuItem eachItem : myItems)
            eachItem.addActionListener(this);


        add(labelInfo);

        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == colorRed)
            getContentPane().setBackground(Color.RED);
        else if(e.getSource() == colorBlue)
            getContentPane().setBackground(Color.BLUE);
        else if(e.getSource() == colorGreen)
            getContentPane().setBackground(Color.GREEN);
        else if(e.getSource() == newForm)
            new menuExercise();
        else if(e.getSource() == closeForm)
            dispose();
        else if(e.getSource() == closeApplication)
            System.exit(0);


    }
}
