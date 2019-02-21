import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestMovingBall {
    public static void main(String[] args) throws InterruptedException{
        JFrame frame = new JFrame();
        MovingBall panel = new MovingBall();

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        Thread t = new Thread();
        long l = 20;
        while (true) {
            panel.x ++;
            panel.y ++;
            panel.repaint();
            t.sleep(l);
        }
        
    }
}