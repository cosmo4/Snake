package c14;

public class Apple {
    public final int width;
    public final int height;
    public int x;
    public int y;

    public Apple(int xPan, int yPan){
        this.width=xPan/50;
        this.height=yPan/50;
        this.x=xPan/3;
        this.y=yPan/3;
    }

    public void changeXY(){
        //x=(int)((Math.random()*width*50)-width);
        //y=(int)((Math.random()*height*50)-height);
        x+=70;
        y+=70;
        System.out.println("Apple x: "+x);
        System.out.println("Apple y: "+y);
    }
}