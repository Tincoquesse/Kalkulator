package GUI;

import main.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Window extends JFrame implements ActionListener {
    JButton bZero, bJeden, bDwa, bTrzy, bCztery, bPiec, bSzesc, bSiedem, bOsiem, bDziewiec
            , bPlus, bMinus, bMnoz, bDziel, bPrzecinek, bWynik;
    JLabel lWyswietlPasekObliczen;

    private String pasekDziałanTresc = "";

    public Window() throws HeadlessException {
        setSize(255,320);
        setTitle("Kalkulator");
        setLayout(null);

        bZero = new JButton("0");
        bZero.setBounds(0, 220, 60, 60);
        add(bZero);
        bZero.addActionListener(this);

        bPrzecinek = new JButton(".");
        bPrzecinek.setBounds(60, 220, 60, 60);
        add(bPrzecinek);
        bPrzecinek.addActionListener(this);

        bWynik = new JButton("=");
        bWynik.setBounds(120, 220, 60, 60);
        bWynik.setBackground(Color.CYAN);
        add(bWynik);
        bWynik.addActionListener(this);

        bPlus = new JButton("+");
        bPlus.setBounds(180, 220, 60, 60);
        add(bPlus);
        bPlus.addActionListener(this);

        bMinus = new JButton("-");
        bMinus.setBounds(180, 160, 60, 60);
        add(bMinus);
        bMinus.addActionListener(this);

        bJeden = new JButton("1");
        bJeden.setBounds(0, 160, 60, 60);
        add(bJeden);
        bJeden.addActionListener(this);

        bDwa = new JButton("2");
        bDwa.setBounds(60, 160, 60, 60);
        add(bDwa);
        bDwa.addActionListener(this);

        bTrzy = new JButton("3");
        bTrzy.setBounds(120,160,60,60);
        add(bTrzy);
        bTrzy.addActionListener(this);

        bCztery = new JButton("4");
        bCztery.setBounds(0, 100, 60, 60);
        add(bCztery);
        bCztery.addActionListener(this);

        bPiec = new JButton("5");
        bPiec.setBounds(60,100,60,60);
        add(bPiec);
        bPiec.addActionListener(this);

        bSzesc = new JButton("6");
        bSzesc.setBounds(120, 100, 60, 60);
        add(bSzesc);
        bSzesc.addActionListener(this);

        bMnoz = new JButton("*");
        bMnoz.setBounds(180, 100, 60, 60);
        add(bMnoz);
        bMnoz.addActionListener(this);

        bSiedem =new JButton("7");
        bSiedem.setBounds(0, 40, 60, 60);
        add(bSiedem);
        bSiedem.addActionListener(this);

        bOsiem = new JButton("8");
        bOsiem.setBounds(60, 40, 60, 60);
        add(bOsiem);
        bOsiem.addActionListener(this);

        bDziewiec = new JButton("9");
        bDziewiec.setBounds(120, 40, 60, 60);
        add(bDziewiec);
        bDziewiec.addActionListener(this);

        bDziel = new JButton("/");
        bDziel.setBounds(180, 40, 60, 60);
        add(bDziel);
        bDziel.addActionListener(this);

        lWyswietlPasekObliczen = new JLabel("0", SwingConstants.RIGHT);
        lWyswietlPasekObliczen.setBounds(0, 0, 200, 40);
        lWyswietlPasekObliczen.setAutoscrolls(true);
        lWyswietlPasekObliczen.setFont(new Font("Serif", Font.TYPE1_FONT, 20));
        add(lWyswietlPasekObliczen);
    }

    public static void main(String Args[] ) {

        Window okno = new Window();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object źródło = e.getSource();

        if (źródło == bJeden) {
            dodajDoPaska("1");
        }
        else if (źródło == bDwa){
            dodajDoPaska("2");
        }
        else if (źródło == bTrzy) {
            dodajDoPaska("3");
        }
        else if (źródło == bCztery){
            dodajDoPaska("4");
        }
        else if (źródło == bPiec) {
            dodajDoPaska("5");
        }
        else if (źródło == bSzesc){
            dodajDoPaska("6");
        }
        else if (źródło == bSiedem){
            dodajDoPaska("7");
        }
        else if (źródło == bOsiem){
            dodajDoPaska("8");
        }
        else if (źródło == bDziewiec){
            dodajDoPaska("9");
        }
        else if (źródło == bZero){
            dodajDoPaska("0");
        }
        else if (źródło == bDziel){
            dodajDoPaska("/");
        }
        else if (źródło == bPrzecinek){
            dodajDoPaska(".");
        }
        else if (źródło == bPlus){
            dodajDoPaska("+");
        }
        else if (źródło == bMinus){
            dodajDoPaska("-");
        }
        else if (źródło == bMnoz){
            dodajDoPaska("*");
        }
        else if (źródło == bWynik){
            try {
                Calculator oblicz = new Calculator();
                lWyswietlPasekObliczen.setText(oblicz.calculateToScreen(pasekDziałanTresc));

            } catch (IOException ex) {
                ex.printStackTrace();
            }
            pasekDziałanTresc = "";

        }
    }
    public void dodajDoPaska(String symbol){
        pasekDziałanTresc = pasekDziałanTresc.concat(symbol);
        lWyswietlPasekObliczen.setText(pasekDziałanTresc);
    }
}
