package bitlab.askar.Module2.Lesson1;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondPage extends JFrame {

    private Integer[] ages = new Integer[100];
    static Student []students = new Student[10];
    static int counter = 0;


    public SecondPage(){

        for (int i=0;i<100;i++){
            ages[i] = i;
        }


        setSize(500,500);
        setLayout(null);

        JLabel label1 = new JLabel("Name:");
        label1.setSize(100,30);
        label1.setLocation(100,50);
        add(label1);

        JLabel label2 = new JLabel("Surname:");
        label1.setSize(100,30);
        label1.setLocation(100,90);
        add(label2);

        JTextField field1 = new JTextField();
        field1.setSize(100,30);
        field1.setLocation(210,50);
        add(field1);

        JTextField field2 = new JTextField();
        field2.setSize(100,30);
        field2.setLocation(210,90);
        add(field2);

        JComboBox comboBox = new JComboBox(ages);
        comboBox.setSize(100,30);
        comboBox.setLocation(310,140);
        add(comboBox);

        JButton button = new JButton("Click me");
        button.setSize(200,30);
        button.setLocation(100,140);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = field1.getText();
                String surname = field2.getText();
                Integer age = (Integer) comboBox.getSelectedItem();

                Student student = new Student(name,surname,age);

                students[counter] = student;
                counter++;
            }
        });
        add(button);

        JButton backButton = new JButton("Back");
        backButton.setSize(100,100);
        backButton.setLocation(100,180);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Main.menu.setVisible(true);
            }
        });
        add(backButton);
    }
}
