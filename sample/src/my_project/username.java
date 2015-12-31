package my_project;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class p2 extends JPanel implements ActionListener, MouseListener{

    JPanel p;
    
    public static JLabel fn, ln, un, ps1, ps2, eid, mb, cct, hquali, dob, dober, dd, mm, yy;
    JButton sub;
    public JTextField fn1, ln1, un1, eid1, mb1, cct1, hquali1, dober1, dober2, dober3;
    public Label er1, er2, er3, er4, er5, er6, er7, er8, er9, er10,member;
    JPasswordField ps11, ps21;
    JCheckBox c1;
    public static String str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13;

    public p2() throws Exception {

        //setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.DARK_GRAY));
        p = new JPanel();
        //setBackground(Color.white);
        p.setLayout(new GridLayout(11, 3));
        p.setBounds(0, 20, 309, 130);


        un = new JLabel("*  Username");
        ps1 = new JLabel("*  Password");
        ps2 = new JLabel("*  Confirm Password");
        fn = new JLabel("*  First Name");
        ln = new JLabel("   Last Name");
        eid = new JLabel("*  Email ID");
        mb = new JLabel("*  Mobile");
        cct = new JLabel("*  Current City");
        hquali = new JLabel("*  Highest Qualification");
        dob = new JLabel("   DOB");
        dober = new JLabel();
        dd = new JLabel("DD");
        mm = new JLabel("MM");
        yy = new JLabel("YY");
        member=new Label("     already a member?");
        member.addMouseListener(this);

        
        er1 = new Label("");
        er2 = new Label("");
        er3 = new Label("");
        er4 = new Label("");
        er5 = new Label("");
        er6 = new Label("");
        er7 = new Label("");
        er8 = new Label("");
        er9 = new Label("");
        er10 = new Label("");

        un1 = new JTextField(15);
        ps11 = new JPasswordField(15);
        ps21 = new JPasswordField(15);
        fn1 = new JTextField(15);
        ln1 = new JTextField(15);
        eid1 = new JTextField(15);
        mb1 = new JTextField(15);
        cct1 = new JTextField(15);
        hquali1 = new JTextField(15);
        dober1 = new JTextField(2);
        dober2 = new JTextField(2);
        dober3 = new JTextField(2);

        sub = new JButton("Sign up");
        sub.setBorderPainted(false);
        sub.setFocusable(true);
        sub.addActionListener(this);

        dober.setLayout(new FlowLayout());
        dober.add(dober1);
        dober.add(dd);
        dober.add(dober2);
        dober.add(mm);
        dober.add(dober3);
        dober.add(yy);

        p.add(fn);
        p.add(fn1);
        p.add(er1);
        p.add(ln);
        p.add(ln1);
        p.add(er2);
        p.add(un);
        p.add(un1);
        p.add(er3);
        p.add(ps1);
        p.add(ps11);
        p.add(er4);
        p.add(ps2);
        p.add(ps21);
        p.add(er5);
        p.add(eid);
        p.add(eid1);
        p.add(er6);
        p.add(mb);
        p.add(mb1);
        p.add(er7);
        p.add(cct);
        p.add(cct1);
        p.add(er8);
        p.add(hquali);
        p.add(hquali1);
        p.add(er9);
        p.add(dob);
        p.add(dober);
        p.add(er10);
        

        p.add(sub);
        p.add(member);
        add(p);

    }

    public static void goer() throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost", "system", "system");
        String query2 = "select * from logger";
        Statement st2 = con.createStatement();
        ResultSet rs = st2.executeQuery(query2);
        boolean b = false;
        while (rs.next()) {
            if ((rs.getString(3)).equals(p2.str3)) {
                b = true;
            }
        }
        if (b == false) {
            String query1 = "insert into logger values('" + p2.str1 + "','" + p2.str2 + "','" + p2.str3 + "','" + p2.str4 + "','" + p2.str5 + "','" + p2.str7 + "','" + p2.str8 + "','" + p2.str9 + "','" + p2.str13 + "')";
            Statement st1 = con.createStatement();
            st1.executeQuery(query1);
            JOptionPane.showMessageDialog(null, "welcome\n now you are a meber of our team ");
        } else {
            JOptionPane.showMessageDialog(null, "this username already exist");
        }
    }

    public void actionPerformed(ActionEvent e) {
        p2.str1 = fn1.getText();
        p2.str2 = ln1.getText();
        p2.str3 = un1.getText();
        p2.str4 = ps11.getText();
        p2.str5 = eid1.getText();
        p2.str6 = ps21.getText();
        p2.str7 = mb1.getText();
        p2.str8 = cct1.getText();
        p2.str9 = hquali1.getText();
        p2.str10 = dober1.getText();
        p2.str11 = dober2.getText();
        p2.str12 = dober3.getText();
        p2.str13 = p2.str10 + "/" + p2.str11 + "/" + p2.str12;

        boolean bl1, bl2, bl3, bl4, bl5, bl6, bl7, bl8, bl9;
        bl1 = false;
        bl2 = false;
        bl3 = false;
        bl4 = false;
        bl5 = false;
        bl6 = false;
        bl7 = false;
        bl8 = false;

        if (str1.length() > 0) {
            //er1.setForeground(null);
            er1.setText("");
            fn1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            bl1 = true;
            repaint();
        } else {
            er1.setForeground(Color.red);
            er1.setText("(First name can't be null)");
            fn1.setBorder(BorderFactory.createLineBorder(Color.red));
            repaint();
        }

        if (str3.length() > 0) {
            er3.setText("");
            un1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            bl2 = true;
            repaint();

        } else {
            er3.setForeground(Color.red);
            er3.setText("(Username can't be null)");
            un1.setBorder(BorderFactory.createLineBorder(Color.red));
            repaint();
        }

        if (str5.length() > 0) {
            er6.setText("");
            eid1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            bl3 = true;
            repaint();

        } else {
            er6.setForeground(Color.red);
            er6.setText("(email id can't be null)");
            eid1.setBorder(BorderFactory.createLineBorder(Color.red));
            repaint();
        }

        if (str4.length() > 0) {
            er4.setText("");
            ps11.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            bl4 = true;
            repaint();

        } else {
            er4.setForeground(Color.red);
            er4.setText("(Password can't be null)");
            ps11.setBorder(BorderFactory.createLineBorder(Color.red));
            repaint();
        }

        if ((str4.equals(str6))) {
            str6 = str4;
            er5.setForeground(null);
            er5.setText("");
            ps21.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            bl5 = true;
            repaint();

        } else {
            er5.setForeground(Color.red);
            er5.setText("(both pwd should be same)");
            ps21.setBorder(BorderFactory.createLineBorder(Color.red));
            repaint();
        }
        if (str7.length() == 10) {
            er7.setText("");
            mb1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            bl6 = true;
            repaint();

        } else {
            er7.setForeground(Color.red);
            er7.setText("(number should be of 10 digit)");
            mb1.setBorder(BorderFactory.createLineBorder(Color.red));
            repaint();
        }
        if (str8.length() > 0) {
            er8.setText("");
            cct1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            bl7 = true;
            repaint();

        } else {
            er8.setForeground(Color.red);
            er8.setText("(Current City can't be null)");
            cct1.setBorder(BorderFactory.createLineBorder(Color.red));
            repaint();
        }
        if (str9.length() > 0) {
            er9.setText("");
            hquali1.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            bl8 = true;
            repaint();

        } else {
            er9.setForeground(Color.red);
            er9.setText("(Highest Qualif. can't be null)");
            hquali1.setBorder(BorderFactory.createLineBorder(Color.red));
            repaint();
        }

        try {
            if ((bl1 && bl2 && bl3 && bl4 && bl5 && bl6 && bl7 && bl8)==true) {
                JOptionPane.showMessageDialog(null, "Data submitting ");
                p2.goer();
            }
        } catch (Exception e3) {
        }
    }

    public void mouseClicked(MouseEvent e) {
        
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}

class p3 extends Panel {

    public p3() {
        setLayout(new BorderLayout());
        //setBackground(Color.white);
        //setForeground(Color.black);
        JLabel C = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\project\\bigpicture2.jpg"));
        JLabel C1 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\project\\flyer.png"));

        try {
            //setBounds(100, 100, 500, 300);
            add(BorderLayout.NORTH, C1);
           add(BorderLayout.EAST, new p2());
           add(BorderLayout.SOUTH, C);
        } catch (Exception e) {
        }
    }
}

public class username extends JFrame {

    public username() {
        setLayout(new BorderLayout());
        setVisible(true);
        setResizable(false);
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int hight = Toolkit.getDefaultToolkit().getScreenSize().height;
        setBounds(300, 0, width - 600, hight );
        add(BorderLayout.CENTER, new p3());
    }

    public static void main(String[] args) {
        username usn = new username();
    }
}
