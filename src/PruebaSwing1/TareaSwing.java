package PruebaSwing1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TareaSwing {
    private JButton reiniciarButton;
    private JSpinner spinner1;
    private JProgressBar progressBar1;
    private JButton pulsarButton;
    private JPanel jPanel2;

    private Timer timerProgressBar1;
    private boolean pulsar = false;

    public TareaSwing() {
        pulsarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        timerProgressBar1 = new Timer (1000, t ->{
            int valor = progressBar1.getValue();
            if (pulsar){
                if (valor < progressBar1.getMaximum()){
                    progressBar1.setValue(valor + 1);
                }
            } else {
                if (valor > progressBar1.getMinimum()) {
                    progressBar1.setValue(valor - 1);
                } else {
                    timerProgressBar1.stop();
                }
            }
        });

        pulsarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                pulsar= true;
                timerProgressBar1.start();

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                pulsar = false;

            }
        });



//            @Override
//            public void mousePressed(MouseEvent e) {
//                super.mousePressed(e);
//                int valor = progressBar1.getValue();
//                progressBar1.setValue(valor + 1);
//
//            }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Titulo de mi ventana");

        TareaSwing form1 = new TareaSwing();
        frame.setContentPane(form1.jPanel2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);


    }
}
