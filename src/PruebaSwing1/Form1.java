package PruebaSwing1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    private JPanel jPanel1;
    private JLabel jLabel1;
    private JButton button1;
    private JTextField textField1;
    private JButton button2;
    private JCheckBox checkBox1;
    private JButton button3;

    public Form1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("Hola Jander");

            }
        });

        /*button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/

        button2.addActionListener( e -> {
            if (checkBox1.isSelected()){
                checkBox1.setSelected(false);
            } else {
                checkBox1.setSelected(true);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("Hola Eydan");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Titulo de mi ventana");

        Form1 form1 = new Form1();
        frame.setContentPane(form1.jPanel1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);


    }
}
