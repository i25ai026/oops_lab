package LAB 10;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class ImageApplet extends Applet {
    Image img;

    public void init() {
        img = getImage(getDocumentBase(), "sample.jpg");
    }

    public void paint(Graphics g) {
        g.drawImage(img, 50, 50, this);
    }
}