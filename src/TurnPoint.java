package c14;

public class TurnPoint implements Comparable {
    int x;
    int y;
    int prev;

    TurnPoint(int x, int y, int prev){
        this.x=x;
        this.y=y;
        this.prev=prev;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
