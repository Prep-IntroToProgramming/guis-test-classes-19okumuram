import javax.swing.*;

public class SimpleGui1{ 
    public SimpleGui1() {
        JFrame frame = new JFrame(); //creates a new window
        JButton button = new JButton("click me"); //creating new JButton
        JLabel label = new JLabel("Swing is pretty cool"); //creates new JLabel object
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //
        frame.add(button); //adds the button to the frame (makes it appear)
        frame.add(label); //adds to the frame
        frame.setSize(300, 300); //sets window to a 300x300 pixel? square
        frame.setVisible(true); //makes it appear
    }

    public static void main(String[] args) {
        SimpleGui1 gui = new SimpleGui1(); //creates new SimpleGui1 object using constructor
    }
} 
