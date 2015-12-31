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

public class toolkit extends Frame {
    JList lt;

    public toolkit()
    {
        int width=Toolkit.getDefaultToolkit().getScreenSize().width;
        int hight=Toolkit.getDefaultToolkit().getScreenSize().height;
        setBounds(100,150,width-200,hight-300);
        setVisible(true);
        setResizable(false);
        String[] lE = {"a","b","c","d","e"};
        lt = new JList(lE);
        add(lt);


    }


public static void main(String[] args){
toolkit tk=new toolkit();

}
}
