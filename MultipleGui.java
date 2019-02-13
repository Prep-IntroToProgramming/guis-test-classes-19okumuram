import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MultipleGui implements ActionListener{ 
    JFrame frame;
    JButton b1;
    JButton b4;
    int numClicks = 0;
    public MultipleGui() {
        b1 = new JButton("click me"); //create new button
        JButton b2 = new JButton("hi");
        JButton b3 = new JButton("no");
        b4 = new JButton("go away");
        JButton b5 = new JButton("hi bye");
        frame = new JFrame(); //new frame

        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ensures program stops running when window is closed
        frame.add(BorderLayout.CENTER, b1); //add button to CENTER
        frame.add(BorderLayout.NORTH, b2); //add button to TOP
        frame.add(BorderLayout.EAST, b3); //add button to RIGHT
        frame.add(BorderLayout.SOUTH, b4); //add button to BOTTOM
        frame.add(BorderLayout.WEST, b5); //add button to LEFT
        //frame.add(label);

        b1.addActionListener(this); //action listener superclass; tells program when to react to button
        b4.addActionListener(this);
        frame.setSize(700, 700); //sets frame size
        frame.setVisible(true); //makes frame visible
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == b4) {
            b4.setText("i said go away");
        }
        if (event.getSource() == b1){
            numClicks++;
            if (numClicks == 1) {
                b1.setText("I've been clicked " + numClicks + " time!"); //invoked when action (click) happens
            } else if (numClicks > 1) {
                if (numClicks == 13) {
                    b1.setText(numClicks + " is an unlucky number rip fam");
                } else if (numClicks == 50) {
                    b1.setText(numClicks + " means we're halfway to 100");
                } else if (numClicks == 73) {
                    b1.setText(numClicks + "??? how bored are you?");
                } else if (numClicks == 100) {
                    b1.setText(numClicks + "!! yay! you must be really bored");
                } else {
                    b1.setText("I've been clicked " + numClicks + " times!");
                }
            }
        }
    }

    public static void main(String[] args) {
        MultipleGui gui = new MultipleGui();
    }
} 
