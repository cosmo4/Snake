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
        final Ramka[] ramka = new Ramka[1];
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                 ramka[0] = new Ramka();
            }
        });
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread watek = new Thread(new Runnable() {
            @Override
            public void run() {
                int i=0;
                while(i<900) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ramka[0].repaint();
                    System.out.println(i++);
                }
            }
        });
        watek.start();

    }
}