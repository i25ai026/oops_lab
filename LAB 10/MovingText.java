package LAB 10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class MovingText extends Applet implements KeyListener, Runnable {
    String text = "";
    int x = 300;
    Thread t;

    public void init() {
        addKeyListener(this);
        setFocusable(true);
        t = new Thread(this);
        t.start();
    }

    public void run() {
        while (true) {
            x -= 5;
            if (x < 0) x = getWidth();
            repaint();
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }

    public void paint(Graphics g) {
        g.drawString(text, x, 100);
    }

    public void keyTyped(KeyEvent e) {
        text += e.getKeyChar();
    }

    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
}