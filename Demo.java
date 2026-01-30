import lab3.FigPackage.*;

public class Demo {
    public static void main(String[] args) {
        Cone c = new Cone(3, 4, 5);
        c.calcArea();
        c.calcVolume();
        c.dispArea();
        c.dispVolume();

        Sphere s = new Sphere(3);
        s.calcArea();
        s.calcVolume();
        s.dispArea();
        s.dispVolume();

        Cylinder cy = new Cylinder(3, 5);
        cy.calcArea();
        cy.calcVolume();
        cy.dispArea();
        cy.dispVolume();
    }
}
