package c14;

import java.util.*;

class Apple {
    final int width;
    final int height;
    private final int xPan;
    private final int yPan;
    int x;
    int y;

    Random random;

    Apple(int xPan, int yPan){
        this.xPan=xPan;
        this.yPan=yPan;
        this.width=xPan/50;
        this.height=yPan/50;
        random = new Random();
        changeXY();
    }

    void changeXY(){
        while ((((x=random.nextInt(xPan-width)))%(xPan / 20)) != 0){
        }
        while ((((y=random.nextInt(yPan-height)))%(yPan/20))!= 0){
        }
        x+=(width/2);
        y+=(height/2);
    }
}