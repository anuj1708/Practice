/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author appy
 */
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class joption extends JFrame implements ActionListener {
    JTextField f;
    JButton b;
public joption()
    {

setSize(100,100);
f=new JTextField(10);
b=new JButton("ok");
add(f);
add(b);
b.addActionListener(this);
setLayout(new FlowLayout());

}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(f.getText().equals(""))
        {
        //JOptionPane.showMessageDialog(this,"plz fill username");
        String name=JOptionPane.showInputDialog("pls give ur name");
        System.out.println("name u gave=="+name);
        }
    }
    public static void main(String[] args) {
        new joption().setVisible(true);
    }

}
