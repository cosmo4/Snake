package c14;

import java.util.*;

import static java.lang.Thread.sleep;

class Snake {
    final int width;
    final int height;
    private final int xPan;
    private final int yPan;
    int x;
    int y;
    int vector;
    int prev;
    ArrayList<TailPart> tail = new ArrayList<>();

    Snake(int xPan, int yPan) {
        this.xPan = xPan;
        this.yPan = yPan;
        this.width = xPan / 25;
        this.height = yPan / 25;
        this.x = 0;
        this.y = 0;
    }

    void move() {
        if (x <= (xPan - width) && x >= 0 && y >= 0 && y <= (yPan - height)) {
            switch (prev) {
                case 1:
                    x++;
                    break;
                case 2:
                    x--;
                    break;
                case 3:
                    y++;
                    break;
                case 4:
                    y--;
                    break;
            }
        } else {
            System.out.println("KONIEC");
            try {
                sleep(1000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void getsTailPart() {
        if (tail.size() == 0) {
            tail.add(new TailPart(width, height, x, y, prev));
        } else {
            tail.add(new TailPart(tail.get(tail.size() - 1)));
        }
    }

    void bufor() {
        if ((x % (xPan / 20)) == 0 && (y % (yPan / 20)) == 0 && prev != vector) {
            prev = vector;
            if (tail.size() > 0) {
                TurnPoint tempTP = new TurnPoint(x, y, prev);
                for (int i = 0; i < tail.size(); i++) {
                    tail.get(i).turnPoints.add(tempTP);
                }
            }
        }

    }
}
