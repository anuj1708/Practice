/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author appy
 */
public class example

{


            public void area_sq(float a){
        
        float ar=a*a;
        System.out.println("area of square= " + ar);
        }
    public

     void area_rect(float a, float b) {

        float ar = a * b;
        System.out.println("area of rectangle= " + ar);
    }

    public void area_crl(float a) {

        double ar = 3.14 * a * a;
        System.out.println("area of circle= " + ar);



    }


    public static void main(String[] arg) {

        example e1 = new example();
        e1.area_sq(2);
        e1.area_rect(3, 4);
        e1.area_crl(4);
    }
}
