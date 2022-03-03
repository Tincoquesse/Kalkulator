import GUI.Window;
import menageData.FileMenager;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class Run {
    public static void main(String[] args) throws IOException {

        FileMenager fileMenager = new FileMenager("calculationHistory.txt");
        Window window = new Window(fileMenager);
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                fileMenager.closeWriting();
            }
        });
    }
}
