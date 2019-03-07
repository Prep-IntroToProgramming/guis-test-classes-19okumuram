import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MovingBall extends JPanel {
    int height = 150;
    int width = 150;
    int x = 0;
    int y = 0;
    public MovingBall(){
        
    }
    @Override
    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.green);
        g.fillOval(x, y, width, height);
    }
}