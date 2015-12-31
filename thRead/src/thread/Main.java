/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author appy
 */
public class Main extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(2000);
                System.out.println("i=" + i);
            }


        } catch (Exception e) {
        }
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(20);
                System.out.println("i=" + i);
            }


        } catch (Exception e) {
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main t1 = new Main();
        t1.start();

    }
}
