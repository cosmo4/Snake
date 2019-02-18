package c14;

import javax.swing.*;
import java.awt.*;

public class Grafika extends JPanel {

    private Dimension dim;
    private Graphics2D g2d;
    private Snake snack;

    public Grafika() {
        super();
        setPreferredSize(dim = new Dimension(800, 800));
        snack = new Snake(dim.width, dim.height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g2d = (Graphics2D) g;
        g2d.drawOval(dim.width / 2, dim.height / 2, dim.width / 50, dim.width / 50);
        g2d.drawRect(snack.getX(), snack.getY(), snack.width, snack.height);
    }
}