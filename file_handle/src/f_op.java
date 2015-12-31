
import java.io.*;
import java.util.*;
import java.text.*;

public class f_op {

    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\appy\\Desktop\\most imp work.txt");
        if (!f.exists()) {
            f.createNewFile();

        }

        FileWriter f1 = new FileWriter(f.getAbsolutePath());
        BufferedWriter b = new BufferedWriter(f1);


        Date dNow = new Date( );
      SimpleDateFormat ft =
      new SimpleDateFormat ("hh:mm:ss");

      System.out.println("Current Date: " + ft.format(dNow));


        String content = ""+ft.format(dNow);
        //String content1 = "appene();
        String content1 = "append1";
        //b.write(content);
        //long end=content.length()+f.length()+1;
        b.append(content);
        b.append(content1);
        b.close();
        //f1.close();




    }
}
