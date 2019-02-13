import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PaintedPanel extends JPanel {
    int height = 200;
    int width = 200;
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(25, 25, width, height);
    }
}
