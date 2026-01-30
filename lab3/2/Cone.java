package lab3.2;
class Cone extends Figure {
    double n, s, r;

    Cone(double r, double n, double s) {
        this.r = r;
        this.n = n;
        this.s = s;
    }

    public void calcArea() {
        a = (Math.PI * r * s) + (Math.PI * r * r);
    }

    public void calcVol() {
        v = (Math.PI* r * r * n) / 3;
    }

    public void dispArea() {
        System.out.println("Cone Area = " + a);
    }

    public void dispVol() {
        System.out.println("Cone Volume = " + v);
    }
}