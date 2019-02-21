import javax.swing.*;
import java.awt.*;

public class RandomPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        int red1 = (int)(Math.random() * 255);
        int blue1 = (int)(Math.random() * 255);
        int green1 = (int)(Math.random() * 255);
        Color BGColor = new Color(red1, green1, blue1);
        g.setColor(BGColor);
        g.fillRect(0,0, this.getWidth(), this.getHeight());
        int red = (int)(Math.random() * 255);
        int blue = (int)(Math.random() * 255);
        int green = (int)(Math.random() * 255);
        Color FGColor = new Color(red, green, blue);
        g.setColor(FGColor);
        g.fillOval(70, 70, 100, 100);
    }
}
