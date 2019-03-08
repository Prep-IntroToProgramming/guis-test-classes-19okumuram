package ComponentDemos;

import java.util.*;
import javax.swing.*;  
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*;

public class CheckBoxes {
    JCheckBox c1;
    JCheckBox c2;
    JCheckBox c3;
    JCheckBox c4;
    JCheckBox c5;
    ArrayList<JCheckBox> boxes = new ArrayList<JCheckBox>();
    JLabel label;
    public CheckBoxes(){
        JFrame frame = new JFrame();
        label = new JLabel();
        frame.setSize(300,300);

        c1 = new JCheckBox(" :) ");
        c2 = new JCheckBox(" :( ");
        c3 = new JCheckBox(" >:) ");
        c4 = new JCheckBox(" >:( ");
        c5 = new JCheckBox(" :/ ");

        boxes.add(c1);
        boxes.add(c2);
        boxes.add(c3);
        boxes.add(c4);
        boxes.add(c5);

        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(c4);
        frame.add(c5);
        frame.add(label);

        frame.setLayout(new FlowLayout());

        BoxListener b = new BoxListener();

        c1.addItemListener(b);
        c2.addItemListener(b);
        c3.addItemListener(b);
        c4.addItemListener(b);
        c5.addItemListener(b);

        frame.setVisible(true);
    }

    public static void main(String[] args){
        CheckBoxes b = new CheckBoxes();
    }

    /*
     * create array, use for loop to check whether or not the box is selected, 
     * change text of label if it is selected
     */
    public class BoxListener implements ItemListener {
        public void itemStateChanged(ItemEvent e){
            label.setText("Current Selection: ");
            for (JCheckBox b: boxes){
                if (b.isSelected() == true){ //if it's selected, it adds box text to label
                    label.setText(label.getText() + b.getText());
                }
            }
        }
    }
}

