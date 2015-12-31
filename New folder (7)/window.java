/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author appy
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class window implements WindowListener {

    JFrame f;

    public window() {
        f = new JFrame("window event");
        f.setVisible(true);
        f.setSize(100, 100);
        f.addWindowListener(this);
    }

    public static void main(String[] arg) {
        window w = new window();
    }

    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(null,"window has opened");
    }

    public void windowClosing(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
      //  f.dispose();
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet.");
    }

    public void windowIconified(WindowEvent e) {
             JOptionPane.showMessageDialog(null,"window has iconified");

    }

    public void windowDeiconified(WindowEvent e) {
                    JOptionPane.showMessageDialog(null,"window has DeIconified");

    }

    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public void windowDeactivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
    }
}
