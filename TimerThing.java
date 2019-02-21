import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TimerThing implements ActionListener {
    int seconds = 0;
    int period = 1000;
    JLabel label;
    Timer myTimer;
    public TimerThing() {
        myTimer = new Timer(period, new TimerListener());
        JFrame frame = new JFrame();
        myTimer.start();
        label = new JLabel();
        frame.add(label);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        TimerThing t = new TimerThing();
    }
    @Override
        public void actionPerformed(ActionEvent event) {

        }
    public class TimerListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            seconds++;
            label.setText("timer:" + seconds);
        }
    }
}