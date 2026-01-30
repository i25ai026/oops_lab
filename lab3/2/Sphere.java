package lab3.2;
class Sphere extends Figure {
    double r;

    Sphere(double r) {
        this.r = r;
    }

    public void calcArea() {
        a = 4 *Math.PI * r * r;
    }

    public void calcVol() {
        v = (4 * Math.PI * r * r * r) / 3;
    }

    public void dispArea() {
        System.out.println("Sphere Area = " + a);
    }

    public void dispVol() {
        System.out.println("Sphere Volume = " + v);
    }
}

