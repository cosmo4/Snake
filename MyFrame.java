package c14;

import javax.swing.*;

public class MyFrame extends JFrame {

    JPanel grafika;

    public MyFrame(){
        super("Snake");
        ImageIcon img = new ImageIcon("C:\\Semestr I\\Programowanie obiektowe i GUI\\Challenges\\src\\c14\\Pictograms-nps-misc-rattlesnakes.png");
        setIconImage(img.getImage());
        grafika = new MyPanel();
        add(grafika);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
