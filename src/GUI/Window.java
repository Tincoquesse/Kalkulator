package GUI;

import calculator_logic.Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Window extends JFrame implements ActionListener {

    private static Color lightblue = new Color(150,200,255);
    private static String stringToScreen = "";
    JButton bClear, bZero, bOne, bTwo, bThree, bFour, bFive,
            bSix, bSeven, bEight, bNine, bPlus, bMinus,
            bMultiply, bDivided, bComma, bEqual;
    JLabel lToScreen;

    public Window() throws HeadlessException {
        setSize(255,320);
        setTitle("Kalkulator");
        setLayout(null);
        setResizable(false);

        Icon iClear = new ImageIcon("src/Icons/alphabetC.png");
        bClear = new  JButton(iClear);
        bClear.setBounds(200, 0, 40, 40);
        add(bClear);
        bClear.addActionListener(this);

        Icon iZero = new ImageIcon("src/Icons/zero.png");
        bZero = new JButton(iZero);
        bZero.setBounds(0, 220, 60, 60);
        add(bZero);
        bZero.addActionListener(this);

        Icon iComma = new ImageIcon("src/Icons/comma.png");
        bComma = new JButton(iComma);
        bComma.setBounds(60, 220, 60, 60);
        add(bComma);
        bComma.addActionListener(this);

        Icon iEqual = new ImageIcon("src/Icons/equal.png");
        bEqual = new JButton(iEqual);
        bEqual.setBounds(120, 220, 60, 60);
        add(bEqual);
        bEqual.addActionListener(this);

        Icon iPlus = new ImageIcon("src/Icons/plus.png");
        bPlus = new JButton(iPlus);
        bPlus.setBounds(180, 220, 60, 60);
        add(bPlus);
        bPlus.addActionListener(this);

        Icon iMinus = new ImageIcon("src/Icons/minus.png");
        bMinus = new JButton(iMinus);
        bMinus.setBounds(180, 160, 60, 60);
        add(bMinus);
        bMinus.addActionListener(this);

        Icon iOne = new ImageIcon("src/Icons/number1.png");
        bOne = new JButton(iOne);
        bOne.setBounds(0, 160, 60, 60);
        add(bOne);
        bOne.addActionListener(this);

        Icon iTwo = new ImageIcon("src/Icons/two.png");
        bTwo = new JButton(iTwo);
        bTwo.setBounds(60, 160, 60, 60);
        add(bTwo);
        bTwo.addActionListener(this);

        Icon iThree = new ImageIcon("src/Icons/three.png");
        bThree = new JButton(iThree);
        bThree.setBounds(120,160,60,60);
        add(bThree);
        bThree.addActionListener(this);

        Icon iFour = new ImageIcon("src/Icons/four.png");
        bFour = new JButton(iFour);
        bFour.setBounds(0, 100, 60, 60);
        add(bFour);
        bFour.addActionListener(this);

        Icon iFive = new ImageIcon("src/Icons/five.png");
        bFive = new JButton(iFive);
        bFive.setBounds(60,100,60,60);
        add(bFive);
        bFive.addActionListener(this);

        Icon iSix = new ImageIcon("src/Icons/six.png");
        bSix = new JButton(iSix);
        bSix.setBounds(120, 100, 60, 60);
        add(bSix);
        bSix.addActionListener(this);

        Icon iMultiply = new ImageIcon("src/Icons/multiply.png");
        bMultiply = new JButton(iMultiply);
        bMultiply.setBounds(180, 100, 60, 60);
        add(bMultiply);
        bMultiply.addActionListener(this);

        Icon iSeven = new ImageIcon("src/Icons/seven.png");
        bSeven =new JButton(iSeven);
        bSeven.setBounds(0, 40, 60, 60);
        add(bSeven);
        bSeven.addActionListener(this);

        Icon iEight = new ImageIcon("src/Icons/eight.png");
        bEight = new JButton(iEight);
        bEight.setBounds(60, 40, 60, 60);
        add(bEight);
        bEight.addActionListener(this);

        Icon iNine = new ImageIcon("src/Icons/nine.png");
        bNine = new JButton(iNine);
        bNine.setBounds(120, 40, 60, 60);
        add(bNine);
        bNine.addActionListener(this);

        Icon iDivided = new ImageIcon("src/Icons/divided.png");
        bDivided = new JButton(iDivided);
        bDivided.setBounds(180, 40, 60, 60);
        add(bDivided);
        bDivided.addActionListener(this);

        lToScreen = new JLabel("0", SwingConstants.RIGHT);
        lToScreen.setBounds(0, 0, 200, 40);
        lToScreen.setAutoscrolls(true);
        lToScreen.setBorder(BorderFactory.createLineBorder(Color.black, 2, true));
        lToScreen.setOpaque(true);
        lToScreen.setBackground(lightblue);
        lToScreen.setFont(new Font("Serif", Font.BOLD, 20));
        add(lToScreen);
    }
    public static void main(String Args[] ) {

        Window window = new Window();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object źródło = e.getSource();

        if (źródło == bOne) {
            dodajDoPaska("1");
        }
        else if (źródło == bTwo){
            dodajDoPaska("2");
        }
        else if (źródło == bThree) {
            dodajDoPaska("3");
        }
        else if (źródło == bFour){
            dodajDoPaska("4");
        }
        else if (źródło == bFive) {
            dodajDoPaska("5");
        }
        else if (źródło == bSix){
            dodajDoPaska("6");
        }
        else if (źródło == bSeven){
            dodajDoPaska("7");
        }
        else if (źródło == bEight){
            dodajDoPaska("8");
        }
        else if (źródło == bNine){
            dodajDoPaska("9");
        }
        else if (źródło == bZero){
            dodajDoPaska("0");
        }
        else if (źródło == bDivided){
            dodajDoPaska("/");
        }
        else if (źródło == bComma){
            dodajDoPaska(".");
        }
        else if (źródło == bPlus){
            dodajDoPaska("+");
        }
        else if (źródło == bMinus){
            dodajDoPaska("-");
        }
        else if (źródło == bMultiply){
            dodajDoPaska("*");
        }
        else if (źródło==bClear){
            stringToScreen = "0";
            lToScreen.setText(stringToScreen);
        }
        else if (źródło == bEqual){
            try {
                Calculator oblicz = new Calculator();
                String sum = oblicz.calculateToScreen(stringToScreen);
                lToScreen.setText(sum);
                stringToScreen = sum;
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void dodajDoPaska(String symbol){
            stringToScreen = stringToScreen.concat(symbol);
            lToScreen.setText(stringToScreen);
    }
}
