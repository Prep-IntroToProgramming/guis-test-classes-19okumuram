package ComponentDemos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuiMouse implements MouseListener{
    JFrame frame = new JFrame();
    DrawPanel panel = new DrawPanel();
    Timer myTimer = new Timer(16, new TListener());
    long milliseconds;
    int numClick = 1;
    int x;
    int y;
    public GuiMouse() {
        panel.addMouseListener(this );
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        myTimer.start();
    }

    public static void main(String[] args) {
        GuiMouse gui = new GuiMouse();
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse is in");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse is out");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println(e.getClickCount() + " clicks!");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Up with " + e.getButton());
    }

    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        panel.repaint();
        if (numClick == 1) {
            milliseconds = e.getWhen();
            numClick++;
        } else {
            System.out.println("The x coordinate is: " + e.getX());
            System.out.println("The y coordinate is: " + e.getY());
            System.out.println("Seconds since last click: " + ((e.getWhen() - milliseconds)/1000));
            milliseconds = e.getWhen();
        }
    }

    class TListener implements ActionListener {
        // override the necessary method.
        // Inside, use getMousePosition() with the appropriate Swing component.
        // Make sure that the object returned is not null
        // Set the new x value, then repaint the frame.
        @Override
        public void actionPerformed(ActionEvent event) {
            Point p = frame.getMousePosition();
            if (p != null){ 
                x = p.x - 25;
                y = p.y - 25;
                frame.revalidate();
                frame.repaint();
            }
        }
    }

    class DrawPanel extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.orange);
            g.fillRect(x, y, 50, 50);
        }
    }
}