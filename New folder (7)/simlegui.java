
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyDrawPanel extends Canvas {

    public static int i = 1;
    public static int j = 1;
    char gt;



	public void paint(Graphics g){
		 Toolkit t= Toolkit.getDefaultToolkit();
		 Image im=t.getImage("C:\\Users\\appy\\Desktop\\programs\\i_O\\images.gif");
	g.drawImage(im, 0+i,0+j,this);

	}

}

public class simlegui implements KeyListener {

    Frame frame;
    String strg="a";
    JTextField txt;
    JButton butto;
    int let=1;
    int take;
    char ch='a';
    public static void main(String[] arg) {
        while(true)
        {
        simlegui gui = new simlegui();
        gui.go();
        }

    }

    public void go() {
        frame = new Frame();

        butto = new JButton("this belong to gobler");
        butto.setBounds(0, 0, 300, 20);
         txt = new JTextField(20);
         txt.addKeyListener(this);
        MyDrawPanel dp = new MyDrawPanel();
        dp.setBounds(0+MyDrawPanel.i, 20+MyDrawPanel.j, 299, 258);
        txt.setText("a");

        txt.setText(strg);

        txt.setBounds(10, 680, 300, 20);

        frame.add(butto);
        frame.add(dp);
        frame.add(txt);
        frame.setLayout(null);


        try {
            for (int i = 1; i < 100; i += 7) {
                //Thread.sleep(200);


            }
        } catch (Exception e) {
        }


        frame.setBounds(0, 0, 800, 800);
        frame.setVisible(true);

    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {

    	frame.repaint();
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



    }

    public void keyReleased(KeyEvent e) {


    }

}

