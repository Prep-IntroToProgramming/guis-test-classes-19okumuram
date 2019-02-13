import javax.swing.*;
import java.awt.*;

public class TestPaintPanel {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        PaintedPanel panel = new PaintedPanel();
        PaintedPanel panel2 = new PaintedPanel();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
