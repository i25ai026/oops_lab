package LAB 10;
import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;

public class ClockApplet extends Applet implements Runnable {
    Thread t;

    public void init() {
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        Date d = new Date();
        g.drawString("Current Date & Time: " + d.toString(), 50, 50);
    }
}
