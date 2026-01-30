package lab3.FigPackage;

public class Cylinder extends Figure {
    double n;

    public Cylinder(double r, double n) {
        this.r = r;
        this.n = n;
    }

    public void calcArea() {
        a = (2 * pi * r * r) + (2 * pi * r * n);
    }

    public void calcVolume() {
        v = pi * r * r * n;
    }

    public void dispArea() {
        System.out.println("Cylinder Area = " + a);
    }

    public void dispVolume() {
        System.out.println("Cylinder Volume = " + v);
    }
}
