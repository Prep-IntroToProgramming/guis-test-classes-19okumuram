import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MultiGuiChallenge implements ActionListener{ 
    JFrame frame;
    JButton b1;
    JButton b2;
    int numClicks = 0;
    public MultiGuiChallenge() {
        b1 = new JButton("click me"); //create new button
        b2 = new JButton("go away");
        frame = new JFrame(); //new frame
        Button1Listener b1Listen = new Button1Listener();
        Button2Listener b2Listen = new Button2Listener();
        //JLabel label = new JLabel("Swing is pretty cool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ensures program stops running when window is closed
        frame.add(BorderLayout.EAST, b1); //add button to CENTER
        frame.add(BorderLayout.WEST, b2); //add button to BOTTOM
        //frame.add(label);
        b1.addActionListener(b1Listen); //action listener superclass; tells program when to react to button
        b2.addActionListener(b2Listen);
        frame.setSize(700, 700); //sets frame size
        frame.setVisible(true); //makes frame visible
    }

    public void actionPerformed(ActionEvent event) {

    }

    public static void main(String[] args) {
        MultiGuiChallenge gui = new MultiGuiChallenge();
    }
    public class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            numClicks++;
            b1.setText("I've been clicked " + numClicks + " time!"); //invoked when action (click) happens
        }
    }
    public class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            b2.setText("I said to go away");
        }
    }
} 
