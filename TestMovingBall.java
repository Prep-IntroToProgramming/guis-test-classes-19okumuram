import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TestMovingBall {
    MovingBall panel;
    public TestMovingBall() {
        panel = new MovingBall();
        JFrame frame = new JFrame();
        Timer t = new Timer(10, new TimerListener());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
        t.start();
    }

    public static void main(String[] args) {
        TestMovingBall testBall = new TestMovingBall();
    }
    class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            panel.x++;
            panel.y++;
            panel.repaint();
        }
    }
}