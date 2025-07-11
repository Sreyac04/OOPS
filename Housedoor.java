import java.awt.*;
import java.awt.event.*;

public class Housedoor extends Frame implements MouseListener, MouseMotionListener 
{
    Color br = new Color(0, 0, 255);

    public Housedoor() 
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    public void mouseClicked(MouseEvent e) 
    {
        br = new Color(255, 10, 0);
        repaint();
    }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseDragged(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
    public void paint(Graphics g) 
    {
        g.setColor(Color.green);
        int[] x = {100, 160, 200};
        int[] y = {100, 50, 100};
        g.fillPolygon(x, y, 3);

        g.setColor(Color.yellow);
        g.fillRect(100, 100, 120, 120);

        g.setColor(br);
        g.fillRect(145, 160, 30, 60);
    }
    public static void main(String[] args) 
    {
        Housedoor appwin = new Housedoor();
        appwin.setSize(new Dimension(500, 500));
        appwin.setTitle("Housedoor");
        appwin.setVisible(true);
    }
}
class MyWindowAdapter extends WindowAdapte
 {
    public void windowClosing(WindowEvent we)
    {
        System.exit(0);
    }
}











### **Short Algorithm: Housedoor**

1. Create a window titled "Housedoor" and set its size.
2. Register mouse and window listeners.
3. In `paint` method:

   * Draw a green roof (triangle).
   * Draw a yellow house body (rectangle).
   * Draw a door using color `br`.
4. On mouse click:

   * Change `br` to red.
   * Repaint the window.
5. On window close:

   * Exit the program.


