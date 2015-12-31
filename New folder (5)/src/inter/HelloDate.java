/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inter;

import java.util.*;


class good_dog{
private int size;
public int getSize(){
return size;
    }

public int setSize(int s){
    size=s;
    return s;

}
}
public class HelloDate {
public static void main(String[] args) {
/** 
* <pre>
* System.out.println(new Date());
* </pre>
*/
    good_dog ccd=new good_dog();
System.out.println("Hello, it's: ");
System.out.println(new Date());
System.out.append('5');
ccd.setSize(30);
System.out.println(ccd.getSize());



}
}