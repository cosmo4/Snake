package c14;
/*
Knowladge and code taken only from this (sub)sites:
- How to change icon - https://stackoverflow.com/questions/1614772/how-to-change-jframe-icon
- How classes/methods works - https://docs.oracle.com/en/java/javase/11/docs/api/index.html
- Basics of AWT/String - https://javastart.pl/baza-wiedzy/darmowy-kurs-java/grafika_awt_swing
*/
import javax.swing.*;
import java.awt.*;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        final JFrame[] myFrame = new MyFrame[1];
        EventQueue.invokeLater(() -> myFrame[0] = new MyFrame());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread = new Thread(() -> {
            int i=0;
            while(i<900) {
                try {
                    sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                myFrame[0].repaint();
                i++;
            }
        });
        thread.start();

    }
}