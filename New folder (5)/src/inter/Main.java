/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inter;

/**
 *
 * @author appy
 */
interface trans{

void sum();
void devide();

}
public class Main implements trans{
    public void sum()
    {
        System.out.println("this is by sum method");
    }
    public void devide()
    {
        System.out.println("this is by devide method");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main ma=new Main();
        ma.sum();
        ma.devide();

        // TODO code application logic here
    }

}
