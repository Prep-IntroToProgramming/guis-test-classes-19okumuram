import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleGuiTwoComps implements ActionListener {
    JFrame frame = new JFrame();
    RandomPanel panel = new RandomPanel();
    JButton button = new JButton();
    public SimpleGuiTwoComps () {
        frame.add(panel);
        frame.add(BorderLayout.WEST,button);
        frame.setSize(300, 300);
        frame.setVisible(true);
        button.addActionListener(this);
    }
    
    public static void main(String[] args){
        SimpleGuiTwoComps s = new SimpleGuiTwoComps();
    }

    public void actionPerformed(ActionEvent event) {
        panel.repaint();
    }
}

