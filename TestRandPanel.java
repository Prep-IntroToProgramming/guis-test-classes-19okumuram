import javax.swing.*;
import java.awt.*;
public class TestRandPanel {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        RandomPanel panel = new RandomPanel();
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}