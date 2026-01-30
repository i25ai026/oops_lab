package lab3;
class Figure {
    double r, a, v;

    public void dispArea() {
        System.out.println("Area: " + a);
    }

    public void dispVolume() {
        System.out.println("Volume: " + v);
    }
}

class Cone extends Figure {
    double h, s;

    Cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    public void calcArea() {
        a = Math.PI * r * (r + s); 
    }

    public void calcVolume() {
        v = (Math.PI * r * r * h) / 3; 
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Cone c = new Cone(20, 55, 90);
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();
    }
}
