import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener{ 
    JFrame frame;
    JButton button;
    int numClicks = 0;
    public SimpleGui1B() {
        button = new JButton("click me"); //create new button
        frame = new JFrame(); //new frame

        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ensures program stops running when window is closed
        frame.add(button); //add button
        //frame.add(label);

        button.addActionListener(this); //action listener superclass; tells program when to react to button
        frame.setSize(300, 300); //sets frame size
        frame.setVisible(true); //makes frame visible
    }

    public void actionPerformed(ActionEvent event) {
        numClicks++;
        if (numClicks == 1) {
            button.setText("I've been clicked " + numClicks + " time!"); //invoked when action (click) happens
        } else if (numClicks > 1) {
            if (numClicks == 13) {
                button.setText(numClicks + " is an unlucky number rip fam");
            } else if (numClicks == 50) {
                button.setText(numClicks + " means we're halfway to 100");
            } else if (numClicks == 73) {
                button.setText(numClicks + "??? how bored are you?");
            } else if (numClicks == 100) {
                button.setText(numClicks + "!! yay! you must be really bored");
            } else {
                button.setText("I've been clicked " + numClicks + " times!");
            }
        }
    }

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
    }
} 
