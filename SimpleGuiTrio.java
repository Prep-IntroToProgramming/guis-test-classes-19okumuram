import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class SimpleGuiTrio implements ActionListener{ 
    JFrame frame;
    JButton b1;
    JButton b2;
    RandomPanel p1;
    int numClicks = 0;
    public SimpleGuiTrio() {
        b1 = new JButton("change circle color"); //create new button
        b2 = new JButton("change rectangle color");
        p1 = new RandomPanel();
        frame = new JFrame(); //new frame
        Button1Listener b1Listen = new Button1Listener();
        Button2Listener b2Listen = new Button2Listener();
        //JLabel label = new JLabel("Swing is pretty cool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ensures program stops running when window is closed
        frame.add(BorderLayout.EAST, b1); //add button to CENTER
        frame.add(BorderLayout.WEST, b2); //add button to BOTTOM
        frame.add(BorderLayout.CENTER, p1);
        //frame.add(label);
        b1.addActionListener(b1Listen); //action listener superclass; tells program when to react to button
        b2.addActionListener(b2Listen);
        frame.setSize(700, 700); //sets frame size
        frame.setVisible(true); //makes frame visible
    }

    public void actionPerformed(ActionEvent event) {

    }

    public static void main(String[] args) {
        SimpleGuiTrio gui = new SimpleGuiTrio();
    }
    public class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            p1.repaint();
        }
    }
    public class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            
        }
    }
} 
