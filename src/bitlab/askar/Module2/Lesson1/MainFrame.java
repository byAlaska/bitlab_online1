package bitlab.askar.Module2.Lesson1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private Integer[] ages = new Integer[100];
    JTextArea textArea;

    public MainFrame() {

        for (int i = 0; i < 100; i++) {
            ages[i] = i;
        }

        setTitle("Bitlab App");
        setSize(500, 500);
        setLayout(null);

        JLabel label = new JLabel("Text is here");
        label.setSize(200, 30);
        label.setLocation(100, 100);
        add(label);

        JTextField textField = new JTextField();
        textField.setSize(200, 30);
        textField.setLocation(180, 100);
        add(textField);

        textArea = new JTextArea();
        textArea.setSize(300, 200);
        textArea.setLocation(100, 180);

        add(textArea);

        JComboBox comboBox = new JComboBox(ages);
        comboBox.setSize(100, 30);
        comboBox.setLocation(310, 140);
        add(comboBox);

        JButton button = new JButton("Click me");
        button.setSize(200, 30);
        button.setLocation(100, 140);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String string = textField.getText();

                if (!string.equals("")) {
                    Integer age = (Integer) comboBox.getSelectedItem();
                    textArea.append(string + " - " + age + "\n");
                    textField.setText("");
                }

            }
        });
        add(button);

        JButton backButton = new JButton("Back");
        backButton.setLocation(400, 400);
        backButton.setSize(80, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Main.menu.setVisible(true);
            }
        });
        add(backButton);

    }

    public void update(){
        textArea.setText("");
        for (int i = 0; i < SecondPage.counter; i++) {
            textArea.append(SecondPage.students[i].toString());
        }
    }
}
