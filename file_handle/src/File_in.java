import java.io.*;

public class File_in{

    public static void main(String[] args) throws Exception
    {
        File f=new File("C:\\Users\\Anuj Garg\\Desktop\\tim.jpg");

        FileReader fr=new FileReader(f);
        BufferedReader b=new BufferedReader(fr);
        String data;
        while((data=b.readLine())!=null){
            System.out.println(data);}
        b.close();
        
    }


}
