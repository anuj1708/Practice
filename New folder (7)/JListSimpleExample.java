
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class JListSimpleExample extends JFrame implements ListSelectionListener {

    public static void main(String[] args) {
        new JListSimpleExample();
    }
    public JList sampleJList;
    private JTextField valueField;

    public JListSimpleExample() {
        {
            String[] entries = {"SELECT NONE", "Entry 2", "Entry 3", "Entry 4", "Entry 5", "Entry 6"};
            sampleJList = new JList(entries);
            sampleJList.setVisibleRowCount(1);
            sampleJList.addListSelectionListener(this);
            JScrollPane listPane = new JScrollPane(sampleJList);
            JPanel listPanel = new JPanel();
            listPanel.add(listPane);
            add(listPanel, BorderLayout.CENTER);
        }
            JLabel valueLabel = new JLabel("Last Selection:");
            valueField = new JTextField("ANY", 7);

            //JPanel valuePanel = new JPanel();
            //valuePanel.add(valueLabel);
            //valuePanel.add(valueField);
            //add(valuePanel, BorderLayout.SOUTH);

        setSize(100, 150);
        pack();
        setVisible(true);
    }

    public void valueChanged(ListSelectionEvent e) {
        valueField.setText(sampleJList.getSelectedValue().toString());
    }
}
