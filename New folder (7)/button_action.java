/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author appy
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class button_action implements ActionListener {

    JFrame f;
    JButton b;
    JTextField t;
    JPasswordField p;

    public button_action() {
        f = new JFrame("button events");
        f.setSize(100, 100);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        b = new JButton("ok");
        b.addActionListener(this);
        f.add(b);
        t = new JTextField(20);
        f.add(t);
        t.addActionListener(this);
        
        p=new JPasswordField(20);
        p.setEchoChar('?');
        f.add(p);

    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "button has been clicked");
    }

    public static void main(String[] arg) {
        button_action b1 = new button_action();
    }
}
