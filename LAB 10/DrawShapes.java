package LAB 10;
import java.applet.Applet;
import java.awt.Graphics;

public class DrawShapes extends Applet {
    public void paint(Graphics g) {
        g.drawRect(50, 50, 100, 50);
        g.drawOval(200, 50, 100, 50);
        g.drawLine(50, 150, 200, 150);
    }
}