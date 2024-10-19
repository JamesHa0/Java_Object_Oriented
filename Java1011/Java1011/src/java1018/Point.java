package java1018;

public class Point {
    private int x;
    private int y;
    public Point(){
    }
    public Point(int x0,int y0){
        this.x = x0;
        this.y = y0;
    }
    public void movePoint(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
