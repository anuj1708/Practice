/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inter;

/**
 *
 * @author appy
 */


class car_prop{

public void wheels()
{
	System.out.println("Number of wheels are 4");
}


public void complh()
{
System.out.println("complexity is high");
}


public void complm()
{
System.out.println("complexity is medium");
}


public void compll()
{
System.out.println("complexity is low");
}


public void rateh()
{
	System.out.println("rate is high");
}


public void ratem()
{
	System.out.println("rate is medium");
}


public void ratel()
{
	System.out.println("rate is low");
}
public void enter()
{

	System.out.println("");
}


}


class car_names extends car_prop{
public void maaruti()
{
	System.out.println("The properties of maaruti are here as :-");

}

public void bmw()
{
System.out.println("The properties of bmw are here as :-");



}

public void fiat()
{
	System.out.println("The properties of fiat are here as :-");



}


}




class Try extends car_names{
public static void main(String args[]){


	Try od=new Try();


	String abs;
	abs=args[0];
{   if(abs=="maaruti")
	od.maaruti();
	od.wheels();
	od.compll();
	od.ratel();
	od.enter();
}


	if(abs=="fiat")
{
 	od.fiat();
	od.wheels();
	od.complm();
	od.ratem();
	od.enter();
}

	if(abs=="bmw")
{
	od.bmw();
	od.wheels();
	od.compll();
	od.ratel();
	od.enter();
}


}
}