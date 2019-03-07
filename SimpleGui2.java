import javax.swing.*;
import java.awt.*;

public class SimpleGui2{ 
    public SimpleGui2() {
        JFrame frame = new JFrame();
        ImagePanel panel = new ImagePanel();
        //JLabel label = new JLabel("Swing is pretty cool");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(panel);
        
        
        //frame.add(panel2);
        //frame.add(label);
        frame.setSize(panel.getPreferredSize());
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SimpleGui2 gui = new SimpleGui2();
    }
} 
