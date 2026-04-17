package LAB 10;import java.applet.Applet;
import java.awt.Graphics;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        g.drawLine(50, 50, 200, 50);
        g.fillRect(50, 100, 100, 50);
    }
}