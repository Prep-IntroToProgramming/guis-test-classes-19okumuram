import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PaintedPanel extends JPanel {
    int height = 150;
    int width = 150;
    @Override
    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.green);
        g.fillOval(70, 70, width, height);
    }
}
