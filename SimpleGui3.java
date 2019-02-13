import javax.swing.*;
import java.awt.event.*;

public class SimpleGui3 implements ActionListener{ 
    JFrame frame;
    JButton button;
    int dimension = 1000;
    public SimpleGui3() {
        button = new JButton("click me"); //create new button
        frame = new JFrame(); //new frame

        //JLabel label = new JLabel("Swing is pretty cool");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ensures program stops running when window is closed
        frame.add(button); //add button
        //frame.add(label);

        button.addActionListener(this); //action listener superclass; tells program when to react to button
        frame.setSize(dimension, dimension); //sets frame size
        frame.setVisible(true); //makes frame visible
    }

    public void actionPerformed(ActionEvent event) {
        dimension = dimension/2;
        frame.setSize(dimension, dimension);
    }

    public static void main(String[] args) {
        SimpleGui3 gui = new SimpleGui3();
    }
} 
