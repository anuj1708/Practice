
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class test  extends JFrame {


        public static void main(String arg[]) throws Exception
    {
            String a="anu";
        test ed=new test();
    Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=(Connection)DriverManager.getConnection("jdbc:oracle:thin:@localhost","system","system");
        Statement st=con.createStatement();
        String query= "select * from login";
        ResultSet rs=st.executeQuery(query);
        while(rs.next())
        {
        System.out.println("name=="+rs.getString(1));
        System.out.println("id=="+rs.getString(2));
        


        }
        String query1= "insert into login values('"+a+"','678')";
        Statement st1=con.createStatement();
        st1.executeQuery(query1);
}
}
