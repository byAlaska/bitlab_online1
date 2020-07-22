package bitlab.askar.Module2.Lesson1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    private MainFrame parent;
    private SecondPage secondPage;

    private JButton firstPageButton;
    private JButton secondPageButton;
    private JButton exitButton;


    public MainMenu(MainFrame parent, SecondPage secondPage) {

        this.parent = parent;
        this.secondPage = secondPage;

        setSize(500,500);
        setLayout(null);

        firstPageButton = new JButton("First Page");
        firstPageButton.setSize(300,30);
        firstPageButton.setLocation(100,100);
        firstPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.setVisible(true);
                parent.update();
                setVisible(false);
            }
        });
        add(firstPageButton);

        secondPageButton = new JButton("Second Page");
        secondPageButton.setSize(300,30);
        secondPageButton.setLocation(100,150);
        secondPageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondPage.setVisible(true);
                setVisible(false);
            }
        });
        add(secondPageButton);

        exitButton = new JButton("Exit");
        exitButton.setSize(300,30);
        exitButton.setLocation(100,200);
        add(exitButton);
    }
}
