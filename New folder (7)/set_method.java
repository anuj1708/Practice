/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author appy
 */
public class set_method implements Runnable{

    public void run(){

        for(int i=0;i<5;i++)
        {
        System.out.println("thread name=="+Thread.currentThread().getName());

        System.out.println("i="+i);
        }
    }

    public static void main(String[]arg){
        set_method t1=new set_method();
        Thread t=new Thread(t1);
        t.setName("i am the thread");

        set_method t2=new set_method();
        Thread t3=new Thread(t2);
        t3.setName("i am the new argue");
        t3.start();
    }
    }