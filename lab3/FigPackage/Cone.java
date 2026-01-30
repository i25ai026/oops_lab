package lab3.FigPackage;

public class Cone extends Figure {
    double n, s;

    public Cone(double r, double n, double s) {
        this.r = r;
        this.n = n;
        this.s = s;
    }

    public void calcArea() {
        a = (pi * r * s) + (pi * r * r);
    }

    public void calcVolume() {
        v = (pi * r * r * n) / 3;
    }

    public void dispArea() {
        System.out.println("Cone Area = " + a);
    }

    public void dispVolume() {
        System.out.println("Cone Volume = " + v);
    }
}
