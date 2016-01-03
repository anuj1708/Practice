class a{
   public static void main(String[] args){
            int i;float si,p,r,t;
                i=Integer.parseInt(args[0]);
               if(i==0)
              {
		p=Float.parseFloat(args[1]);
		r=Float.parseFloat(args[2]);
		t=Float.parseFloat(args[3]);
		si=(p*r*t)/100;
                System.out.println(si);
}
}
}