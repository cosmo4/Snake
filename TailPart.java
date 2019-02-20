package c14;

import java.util.*;

class TailPart {
    final int width;
    final int height;
    int x;
    int y;
    private int prev;
    PriorityQueue<TurnPoint> turnPoints = new PriorityQueue<>();

    TailPart(int width, int height, int xHead, int yHead, int prev) {
        this.width=width;
        this.height=height;
        this.prev = prev;
        switch (this.prev) {
            case 1:
                y = yHead;
                x = xHead - width;
                break;
            case 2:
                y = yHead;
                x = xHead + width;
                break;
            case 3:
                y = yHead - height;
                x = xHead;
                break;
            case 4:
                y = yHead + height;
                x = xHead;
                break;
        }
    }

    TailPart(TailPart tp) {
        this(tp.width, tp.height, tp.x, tp.y, tp.prev);
    }

    void move() {
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
    }

    void checkTurnPoints(){
        if(    !turnPoints.isEmpty()&&
                turnPoints.peek().x == x &&
                turnPoints.peek().y == y)
        {
            prev = turnPoints.peek().prev;
            turnPoints.poll();
        }
    }
}
