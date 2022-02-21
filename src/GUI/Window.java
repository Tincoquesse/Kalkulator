package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;


public class Window extends JFrame implements ActionListener {
    JButton bPodajDate, bPlus, bWyjście, bMinus;
    JLabel lWyświetlDatę;

    public Window() throws HeadlessException {
        setSize(240,280);
        setTitle("Kalkulator");
        setLayout(null);

        bPlus = new JButton("+");
        bPlus.setBounds(165,120, 60,60);
        add(bPlus);
        bPlus.addActionListener(this);

        bMinus = new JButton("-");
        bMinus.setBounds(165,180, 60,60);
        add(bMinus);
        bMinus.addActionListener(this);

        bPodajDate = new JButton("Podaj datę");
        bPodajDate.setBackground(Color.pink);
        add(bPodajDate);
        bPodajDate.setBounds(0,60, 100,60);
        bPodajDate.addActionListener(this);

        bWyjście = new JButton("X");
        add(bWyjście);
        bWyjście.setBounds(165,60,60,60);
        bWyjście.addActionListener(this);

        lWyświetlDatę = new JLabel("Data: ");
        lWyświetlDatę.setBounds(0, 20, 200,10);
        lWyświetlDatę.setForeground(Color.BLUE);
        add(lWyświetlDatę);
    }

    public static void main(String Args[] ) {

        Window okno = new Window();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object źródło = e.getSource();

        if (źródło == bPodajDate) {
            lWyświetlDatę.setText(new Date().toString());
        }
        else if (źródło == bWyjście){
            dispose();
        }
        else if (źródło == bPlus){
            System.out.println("przycisk bPlus działa");
        }
        else if (źródło == bMinus){
            System.out.println("przycisk minus działa");
        }
    }
}
