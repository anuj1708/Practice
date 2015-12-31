
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyDrawPanel extends JPanel {

    public static int i = 1;
    public static int j = 1;
    char gt;


    public void paintComponent(Graphics g) {


        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gd = new GradientPaint(10, 140, Color.blue, 140, 140, Color.gray);
        g2d.setPaint(gd);




        g2d.fillRect(20 + i, 50+j, 100, 100);



    }

}

public class simlegui implements KeyListener {

    JFrame frame;
    String strg="a";
    JTextField txt;
    JButton butto;
    int let=1;
    int take;
    char ch='a';
    public static void main(String[] arg) {
        simlegui gui = new simlegui();
        gui.go();

    }

    public void go() {
        frame = new JFrame();

        butto = new JButton("this belong to gobler");
         txt = new JTextField(20);
         
        MyDrawPanel dp = new MyDrawPanel();
        
       // txt.setText("a");

        txt.setText(strg);
        JTextField tf = new JTextField();
        System.out.println("work");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.NORTH, butto);
        frame.getContentPane().add(BorderLayout.SOUTH, txt);
        txt.addKeyListener(this);


        try {
            for (int it = 1; it > 0; it += 7)
        	{
                //
        
               Thread.sleep(10);
               MyDrawPanel.i+=2;
               
                frame.add(BorderLayout.CENTER, dp);
                System.out.println("work1");
           


        frame.setBounds(0, 0, 900, 700);
        System.out.println("work2");
        frame.setVisible(true);
            	frame.repaint();

         }
        } catch (Exception e) {
        }

    }

    public void keyTyped(KeyEvent e) {


         strg=txt.getText();
         take= strg.length();

          ch=strg.charAt(take-1);
          strg="";
          txt.setText(strg);
          if(ch=='a')
          {
        	  MyDrawPanel.i-=10;
          }
          if(ch=='d')
          {
        	  MyDrawPanel.i+=10;
          }
          if(ch=='s')
          {
        	  MyDrawPanel.j+=10;
          }
          if(ch=='w')
          {
        	  MyDrawPanel.j-=10;
          }
              	frame.repaint();


    }

    public void keyPressed(KeyEvent e) {



    }

    public void keyReleased(KeyEvent e) {


    }

}
