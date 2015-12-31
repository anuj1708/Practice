/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my_project;

import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author appy
 */
public class try_it extends JFrame implements ActionListener, MouseListener {

    JTextField tf;
    JPasswordField kf;
    JPanel p;
    JButton b;
    public static String s1, s2;
    public static int code;
      JMenuItem menuItem;
    

    public try_it() {
JPopupMenu popup;

    //...where the GUI is constructed:
    //Create the popup menu.
    popup = new JPopupMenu();
    menuItem = new JMenuItem("A popup menu item");
    menuItem.addActionListener(this);
    popup.add(menuItem);
    menuItem = new JMenuItem("Another popup menu item");
    menuItem.addActionListener(this);
    popup.add(menuItem);

    //Add listener to components that can bring up popup menus.
    MouseListener popupListener = new PopupListener();
   // output.addMouseListener(popupListener);
   // menuBar.addMouseListener(popupListener);
        p = new JPanel();
       p.setLayout(new FlowLayout());
        //p.setLayout(null);
        tf = new JTextField(15);
        tf.setBounds(0,0,30,30);
        kf = new JPasswordField(15);
        kf.setBounds(0,30,30,30);

        b = new JButton("submit");
        b.setBounds(0,60,30,30);;
        b.addActionListener(this);
       //b.setBackground(null);
       b.setOpaque(true);
       b.setBorderPainted(false);
        p.add(tf);
        p.add(kf);
        p.add(b);
        p.add(popup);
        add(p);
        setVisible(true);
        setBounds(50, 50, 800, 500);



    }

    public static void go() throws Exception {
        System.out.println(try_it.s2);
                System.out.println(try_it.s1);


     

   Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection cont = DriverManager.getConnection("jdbc:oracle:thin:@localhost", "system", "system");


            String query11 = "select * FROM logger ";
            Statement st1 = cont.createStatement();
            JOptionPane.showMessageDialog(null, "u have logging");
            ResultSet rs5 = st1.executeQuery(query11);
            while (rs5.next()) {
                //if (rs1.getString(2).equals(try_it.s2))
                {
                    //JOptionPane.showMessageDialog(this, "u have logged in");
                    System.out.print(rs5.getString(1));
                }
 //else
                {
                    System.out.println("i failed");

 }

            }
     }

    public void actionPerformed(ActionEvent e) {
        try_it.s1 = tf.getText();
        try_it.s2 = kf.getText();
        try {
            go();

        } catch (Exception e2) {
        }


    }

    public static void main(String arg[]) throws Exception {
        try_it erd = new try_it();


    }

    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
class PopupListener extends MouseAdapter {
    public void mousePressed(MouseEvent e) {
        maybeShowPopup(e);
    }

    public void mouseReleased(MouseEvent e) {
        maybeShowPopup(e);
    }

    private void maybeShowPopup(MouseEvent e) {
        if (e.isPopupTrigger()) {
            //popup.show(e.getComponent(),
                       //e.getX(), e.getY());
        }
    }
}