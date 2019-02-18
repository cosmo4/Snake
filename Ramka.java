package c14;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class Ramka extends JFrame {

    JPanel grafika;

    public Ramka(){
        super("Snake");
        ImageIcon img = new ImageIcon("C:\\Semestr I\\Programowanie obiektowe i GUI\\Challenges\\src\\c14\\Pictograms-nps-misc-rattlesnakes.png");
        setIconImage(img.getImage());
        grafika = new Grafika();
        add(grafika);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
