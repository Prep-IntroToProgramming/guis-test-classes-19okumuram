import javax.swing.*;
import java.awt.*;

public class TestPaintPanel {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        PaintedPanel panel = new PaintedPanel();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
