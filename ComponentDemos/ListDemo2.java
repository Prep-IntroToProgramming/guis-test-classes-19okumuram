package ComponentDemos;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


class ListDemo2 {  
    //declaration outside of constructor
    JList<String> list;
    JLabel label;
    JScrollPane scroller;

    String names[] = {"David", "Isabella", "Matt", "Ty", "Kim", "Lawrence", "Sean"};
    /*
     * list added to scroller, scroller added to frame
     */
    ListDemo2() {  
        JFrame frame = new JFrame("JList Demo");
        frame.setLayout(new FlowLayout());
        frame.setSize(200, 160);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        list = new JList<String>(names);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); //1 element can be selected; can be changed
        list.addListSelectionListener(new ListListener());

        scroller = new JScrollPane(list);
        scroller.setPreferredSize(new Dimension(100,75));

        label = new JLabel("Please choose a name");
        
        frame.add(label);
        frame.add(scroller);
        frame.setVisible(true);
    }  

    public static void main(String args[]) {
        ListDemo2 ld = new ListDemo2();
    }

    class ListListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent le) {
            int[] indices = list.getSelectedIndices();
            int indexNum;
            //sets text of a label to whatever the string of the current selection is
            if(indices.length == 1) {
                indexNum = list.getSelectedIndex();
                label.setText("Current selection: " + names[indexNum]);
            } else if (indices.length > 1){
                label.setText("Current selection: ");
                for (int i: indices) {
                    label.setText(label.getText() + names[i] + ", ");
                }
            } else {
                label.setText("Pick a name please!!");
            }
        }
    }
}
