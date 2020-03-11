package c14;
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