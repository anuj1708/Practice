/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import sun.java2d.pipe.ValidatePipe;

public class my_car implements KeyListener {

    JFrame frm;
    JButton b1;
    JTextField txter;
    public static int row = 0;
    public static int col = 4;
    public char chl;
    public int taken;
    public String strgr = "a";
    int chg = 0, lh2, lh3, lh4, lh5, lh6, lh7, lh8, lh9, lh0;

    public void gold() throws Exception {
        frm = new JFrame();
        frm.setTitle("Background Color for JFrame");
        //frm.setSize(400, 400);
        frm.setLocationRelativeTo(null);
        //frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frm.setVisible(true);
        frm.setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\Untitled.jpg"));
        frm.add(background);
        //background.setLayout(new FlowLayout());
        background.setLayout(null);
        lh2 = (int) (((((Math.random()) * 5) * 5) * 5) * 7);
        lh3 = (int) (((((Math.random()) * 5) * 5) * 5) * 7);
        lh4 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
        lh5 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
        lh6 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
        lh7 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
        lh8 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
        lh9 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
        lh0 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);



        //JLabel l1=new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\images.gif"));
        JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\images.gif"));
        JLabel l2 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\car_top_view.gif"));
        JLabel l3 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\car_top_view.gif"));
        JLabel l4 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\car_top_view.gif"));
        JLabel l5 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\car_top_view.gif"));
        JLabel l6 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\car_top_view.gif"));
        JLabel l7 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\car_top_view.gif"));
        JLabel l8 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\car_top_view.gif"));
        JLabel l9 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\car_top_view.gif"));
        JLabel l0 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\car_top_view.gif"));

        txter = new JTextField(100);
        txter.setBounds(3, 4, 0, 35);


        txter.addKeyListener(this);
        txter.getCursor();
        txter.setText(strgr);
        row += 10;
        for (int it = 1; it > 0; it += 7) {
            // Rectangle r=compu
            l1.setBounds(300 + my_car.row, 400 + my_car.col, 90, 190);
            l2.setBounds(lh2, -250 + chg, 90, 190);
            l3.setBounds(lh3, -750 + chg, 90, 190);
            l4.setBounds(lh4, -1200 + chg, 90, 190);
            l5.setBounds(lh5, -1750 + chg, 90, 190);
            l6.setBounds(lh6, -2250 + chg, 90, 190);
            l7.setBounds(lh7, -2700 + chg, 90, 190);
            l8.setBounds(lh8, -3250 + chg, 90, 190);
            l9.setBounds(lh9, -3800 + chg, 90, 190);
            l0.setBounds(lh0, -4250 + chg, 90, 190);
            chg += 20;
            if (chg >= (5000)) {
                chg = 0;
                lh2 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
                Thread.sleep(7);
                lh3 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
                Thread.sleep(7);
                lh4 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
                Thread.sleep(7);
                lh5 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
                Thread.sleep(7);
                lh6 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
                Thread.sleep(7);
                lh7 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
                Thread.sleep(7);
                lh8 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
                Thread.sleep(7);
                lh9 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
                Thread.sleep(7);
                lh0 = (int) (((((Math.random()) * 5) * 5) * 5) * 5);
            }
            txter.requestDefaultFocus();
            {
            }

            Thread.sleep(50);
            System.out.println(my_car.row);
            l1.repaint();
            l2.repaint();


            //b1=new JButton("I am a button");
            background.add(l1);
            background.add(l2);
            background.add(l3);
            background.add(l4);
            background.add(l5);
            background.add(l6);
            background.add(l7);
            background.add(l8);
            background.add(l9);
            background.add(l0);
            background.add(txter);

            //background.add(b1);
            //frm.setSize(799, 699);
            frm.setBounds(0, 0, 800, 700);
            frm.setResizable(false);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //frm.repaint();
        strgr = txter.getText();
        taken = strgr.length();


        chl = strgr.charAt(taken - 1);
        //strgr = "";
        txter.setText(strgr);
        if (chl == 'a') {
            my_car.row -= 10;
            System.out.println(my_car.row);
        }
        if (chl == 'd') {
            my_car.row += 10;
            System.out.println(my_car.row);

        }
        if (chl == 'w') {
            my_car.col -= 10;
            System.out.println(my_car.col);
        }
        if (chl == 's') {
            my_car.col += 10;
            System.out.println(my_car.col);

        }
        System.out.println(chl);
    }

    //public my_car() throws Exception
    //{
    //   gold();
    //}
    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String args[]) throws Exception {
        my_car mc = new my_car();
        mc.gold();
    }
}
