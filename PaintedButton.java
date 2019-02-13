import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class PaintedButton extends JButton {
   @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(25, 25, 100, 100);
    }
}
