/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author appy
 */
public class ered extends JFrame implements ActionListener {

    JTextField tf, kf;
    JPanel p;
    JButton b;
    public static String s1, s2;
    public static int code;

    public ered() throws Exception {

        p = new JPanel();
        tf = new JTextField(15);
        kf = new JTextField(15);
        b = new JButton("submit");
        b.addActionListener(this);
        p.add(tf);
        p.add(kf);
        p.add(b);
        add(p);
        setVisible(true);
        setBounds(50, 50, 800, 500);

        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost", "system", "system");
        String query1 = "insert into login values('" + ered.s1 + "',ered.code)";
        Statement st1 = con.createStatement();
        st1.executeQuery(query1);

    }
    public void actionPerformed(ActionEvent e) {
        ered.s1 = tf.getText();
        ered.s2 = kf.getText();
        ered.code = Integer.parseInt(s2);


    }

   

    public static void main(String arg[]) throws Exception {
        ered erd=new ered();


    }

    
}
