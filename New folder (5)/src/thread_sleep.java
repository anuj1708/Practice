/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author appy
 */


class go_look extends Thread{


    public void run() {
        try {

            System.out.println("hello");
            Thread.yield();
            System.out.println("go slap that person");

        } catch (Exception e) {
        }
    }


}
public class thread_sleep extends Thread {

    public void run() {
        try {
            
            System.out.println("hello");
            Thread.sleep(50);
            Thread.yield();
            System.out.println("thread name=" + Thread.currentThread().getName());

        } catch (Exception e) {
        }
    }

    public static void main(String[] arg) {
        thread_sleep p = new thread_sleep();
        p.setName("first thread");
        p.start();
        //System.out.println("hello" + Thread.currentThread().getName());
        go_look p1 = new go_look();
        p1.setName("second thread");
        p1.start();
    }
}
