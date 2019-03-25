import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PongBase
{
    JFrame frame = new JFrame();
    // Declare a Swing Timer that fires ~60 times per second
    Timer myTimer = new Timer(16, new TListener());
    PaddlePanel panel = new PaddlePanel();
    int x;
    int y;

    public PongBase() {
        frame.add(panel);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        x = frame.getWidth()/2;
        y = frame.getHeight() - 50;
        frame.setVisible(true);
        myTimer.start();
        // start the timer
    }

    public static void main(String[] args) {
        PongBase pb = new PongBase();
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
                x = p.x - 20;
                frame.revalidate();
                frame.repaint();
            }
        }
    }
    class PaddlePanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            g.setColor(Color.BLACK);
            g.fillRect(x, y, 30, 10);
            //System.out.println(x);
        }
    }
}
