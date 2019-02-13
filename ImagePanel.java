import java.awt.*;
import javax.swing.*;

public class ImagePanel extends JPanel
{
    ImageIcon i = new ImageIcon("Prep.jpg");
    @Override
    public void paintComponent(Graphics g) {
        Image image = i.getImage();
        g.drawImage(image, 3, 4, this);
        //g.setColor(Color.blue);
        //g.fillRect(20, 50,100,100);
    }
}
