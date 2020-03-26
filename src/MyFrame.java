package c14;

import javax.swing.*;

class MyFrame extends JFrame {

    MyPanel myPanel;

    MyFrame(){
        super("Snake");
        ImageIcon img = new ImageIcon("Snacklogo.png");
        setIconImage(img.getImage());
        myPanel = new MyPanel();
        add(myPanel);
        addKeyListener(myPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}