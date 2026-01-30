package lab3.2;
public class Demo {
    public static void main(String[] args) {
        Cone c = new Cone(3, 4, 5);
        c.calcArea();
        c.calcVol();
        c.dispArea();
        c.dispVol();

        Sphere s = new Sphere(3);
        s.calcArea();
        s.calcVol();
        s.dispArea();
        s.dispVol();

        Cylinder cy = new Cylinder(3, 5);
        cy.calcArea();
        cy.calcVol();
        cy.dispArea();
        cy.dispVol();
    }
}

