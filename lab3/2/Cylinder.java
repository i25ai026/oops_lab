package lab3.2;
class Cylinder extends Figure {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public void calcArea() {
        a = (2 * Math.PI* r * r) + (2 * Math.PI * r * h);
    }

    public void calcVol() {
        v = Math.PI * r * r * h;
    }

    public void dispArea() {
        System.out.println("Cylinder Area = " + a);
    }

    public void dispVol() {
        System.out.println("Cylinder Volume = " + v);
    }
}

