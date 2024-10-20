import java1018.Point;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(-2, -2);
        p1.movePoint(10, 10);
        p2.movePoint(3, 3);
        System.out.println(p1.toString());
        System.out.println(p2.toString());

    }
}
