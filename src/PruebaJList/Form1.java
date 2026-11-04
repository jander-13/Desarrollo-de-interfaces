package PruebaJList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    private JPanel panel1;
    private JList list1;
    private JButton cuálEstáSeleccionadoButton;
    private JButton añadirElementoButton;
    private JTextField textField1;
    private JButton eliminarSeleccionadoButton;

    private DefaultListModel<String> model = new DefaultListModel<>();

    public Form1() {
        DefaultListModel model = new DefaultListModel();
        model.addElement("Archena");
        model.addElement("Murcia");
        model.addElement("Cieza");
        list1.setModel(model);


        cuálEstáSeleccionadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) list1.getSelectedValue();
                JOptionPane.showMessageDialog(panel1, s);

            }
        });

        añadirElementoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultListModel<String> model = (DefaultListModel) list1.getModel();
                model.addElement(textField1.getText());
            }
        });
        eliminarSeleccionadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.removeElement(list1.getSelectedValue());
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Prueba JList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Form1().panel1);
        frame.pack();
        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);





    }


}
