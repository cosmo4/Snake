package c14;

import javax.swing.*;

class MyFrame extends JFrame {

    MyPanel myPanel;

    MyFrame(){
        super("Snake");
        ImageIcon img = new ImageIcon("C:\\Semestr I\\Programowanie obiektowe i GUI\\Challenges\\src\\c14\\Pictograms-nps-misc-rattlesnakes.png");
        setIconImage(img.getImage());
        myPanel = new MyPanel();
        add(myPanel);
        addKeyListener(myPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
