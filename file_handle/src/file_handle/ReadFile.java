
package file_handle;


import java.io.*;

public class ReadFile {

    
    public static void main(String[] args) {

        File file=new File("fire.txt");
        try{
            InputStreamReader is=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(new FileReader(file));
            
            PrintWriter out=new PrintWriter(new FileWriter(file));
            String s;
            s=in.readLine();
            while(s!=null)
            {
                out.println(s);
            }
            in.close();
            out.close();
            

        }
        catch(Exception e)
        {}


    }

}
