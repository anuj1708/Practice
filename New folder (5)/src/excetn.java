/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author appy
 */
public class excetn {

    excetn() {
        try {

            sum1();

            System.out.println("Area of Circle");

        } catch (Exception e) {

            System.out.println("Area of Square\n"+e);
        }
    }

    void sum1() throws Exception
    {

    int a=8, b = 0, c;
        c = a / b;
    }

    public static void main(String[] arr) {
        excetn ex = new excetn();

    }
}
