import javax.swing.*;
import java.awt.*;

public class TestPaintButton {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        PaintedButton button = new PaintedButton();
        frame.add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
