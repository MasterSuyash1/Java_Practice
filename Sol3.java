import java.util.*;

class Point {
    private int x, y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to calculate the mid-point
    public Point mid(Point p) {
        int midX = (this.x + p.x) / 2;
        int midY = (this.y + p.y) / 2;
        return new Point(midX, midY);
    }

    // Override toString() method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

public class Sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1;
        int x2, y2;

        // Input for Point p1
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        // Input for Point p2
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        // Create Point objects
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        // Calculate mid-point and print
        Point p3 = p1.mid(p2);
        System.out.println(p3);
    }
}
