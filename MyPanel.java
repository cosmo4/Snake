package c14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.Thread.sleep;

public class MyPanel extends JPanel implements KeyListener {

    Snake snack;
    private Apple iPL;

    MyPanel() {
        super();
        Dimension dim;
        setPreferredSize(dim = new Dimension(800, 800));
        setLocation(500,500);
        snack = new Snake(dim.width, dim.height);
        iPL = new Apple(dim.width, dim.height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(iPL.x, iPL.y, iPL.width, iPL.height);
        g2d.drawRect(snack.x, snack.y, snack.width, snack.height);
        if(snack.tail.size()>0) {
            for (int i = 0; i < snack.tail.size(); i++) {
                g2d.drawRect(snack.tail.get(i).x, snack.tail.get(i).y, snack.tail.get(i).width, snack.tail.get(i).height);
            }
        }
    }

    void collect(){
        if      (((iPL.x+(iPL.width/2))>snack.x)&&
                ((iPL.x+(iPL.width/2))<(snack.x+snack.width))&&
                (((iPL.y+(iPL.height/2))>snack.y))&&
                ((iPL.y+(iPL.height/2))<(snack.y+snack.height)))
        {
            iPL.changeXY();
            snack.getsTailPart();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_RIGHT&&snack.prev!=2&&snack.vector!=1){
            snack.vector=1;
            try {
                sleep(5);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getKeyCode()==KeyEvent.VK_LEFT&&snack.prev!=1&&snack.vector!=2){
            snack.vector=2;
            try {
                sleep(5);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getKeyCode()==KeyEvent.VK_DOWN&&snack.prev!=4&&snack.vector!=3){
            snack.vector=3;
            try {
                sleep(5);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getKeyCode()==KeyEvent.VK_UP&&snack.prev!=3&&snack.vector!=4){
            snack.vector=4;
            try {
                sleep(5);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
}