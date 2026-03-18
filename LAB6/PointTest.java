package LAB6;
class Point3D {
    int x, y, z;

    Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void input(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void display() {
        System.out.println("(" + x + "," + y + "," + z + ")");
    }

    double distance(Point3D p) {
        int dx = x - p.x;
        int dy = y - p.y;
        int dz = z - p.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}

public class PointTest {
    public static void main(String[] args) {

        Point3D p1 = new Point3D();
        Point3D p2 = new Point3D(3, 4, 5);

        p1.input(1, 2, 3);

        System.out.print("Point 1: ");
        p1.display();

        System.out.print("Point 2: ");
        p2.display();

        double dist = p1.distance(p2);
        System.out.println("Distance between points: " + dist);
    }
}

