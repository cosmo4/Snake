package c14;
/*
Knowladge and code taken only from this (sub)sites:
- How to change icon - https://stackoverflow.com/questions/1614772/how-to-change-jframe-icon
- How classes/methods works - https://docs.oracle.com/en/java/javase/11/docs/api/index.html
- Basics of AWT/String - https://javastart.pl/baza-wiedzy/darmowy-kurs-java/grafika_awt_swing
*/
import java.awt.*;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        final MyFrame[] myFrame = new MyFrame[1];
        EventQueue.invokeLater(() -> myFrame[0] = new MyFrame());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(() -> {
            while (true) {
                try {
                    sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                myFrame[0].repaint();
            }
        }).start();
        new Thread(() -> {
            while (true) {
                try {
                    sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                myFrame[0].myPanel.collect();
            }
        }).start();
        new Thread(() -> {
            while (true) {
                try {
                    sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                myFrame[0].myPanel.snack.move();

            }
        }).start();
        new Thread(() -> {
            while (true) {
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                myFrame[0].myPanel.snack.bufor();
            }
        }).start();
    }
}