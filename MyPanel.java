package c14;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    private Dimension dim;
    private Snake snack;
    private Apple iPL;

    public MyPanel() {
        super();
        setPreferredSize(dim = new Dimension(800, 800));
        snack = new Snake(dim.width, dim.height);
        iPL = new Apple(dim.width, dim.height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        snack.move();
        if(collision()){
            iPL.changeXY();
            snack.getsBigger();
        }
        g2d.drawOval(iPL.x, iPL.y, iPL.width, iPL.height);
        g2d.drawRect(snack.x, snack.y, snack.width, snack.height);
    }

    public boolean collision(){
        if(snack.x+snack.width==iPL.x&&snack.y+snack.height==iPL.y) {
            return true;
        }else return false;
    }
}