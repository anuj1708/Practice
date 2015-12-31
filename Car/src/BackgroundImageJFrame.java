
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myhead extends JPanel implements KeyListener {

    JButton b1;
    JTextField txter;
    JPanel p, p2;
    public int row = 4;
    public int col = 4;
    public char chl;
    public int taken;
    public String strgr;

    public myhead() {
        p = new JPanel();
        p2 = new JPanel();
        System.out.println("work1");

        setVisible(true);
        p2.setLayout(new BorderLayout());
        System.out.println("work2");
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\Untitled.jpg"));
        p2.add(background);
        //background.setLayout(new FlowLayout());
        background.setLayout(null);


        //JLabel l1=new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\images.gif"));
        JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\appy\\Desktop\\programs\\i_O\\images.gif"));
        txter = new JTextField(100);
        txter.setText("type");
        System.out.println("work3");
        txter.setBounds(3, 4, 300, 35);

        txter.addKeyListener(this);
        row += 10;
        p.setBounds(300 + row, 400, 150, 350);
        p.add(l1);
        System.out.println("work4");
        background.add(p);
        background.add(txter);
        add(p2);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        repaint();
        strgr = txter.getText();
        taken = strgr.length();

        chl = strgr.charAt(taken - 1);
        //strgr="";
        txter.setText(strgr);
        if (chl == 'a') {
            row -= 10;
            System.out.println(row);
        }
        if (chl == 'd') {
            row += 10;
            System.out.println(row);

        }
        System.out.println(chl);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    }
}

public class BackgroundImageJFrame extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public void BackgroundImage() {
        setTitle("Background Color for JFrame");
        setSize(400, 400);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //b1=new JButton("I am a button");
        //background.add(l1);


        //background.add(b1);
        setSize(799, 699);
        setSize(800, 700);
        setResizable(false);

        add(new myhead());
    }

    public static void main(String args[]) {
        BackgroundImageJFrame give = new BackgroundImageJFrame();
        give.BackgroundImage();
    }
}
