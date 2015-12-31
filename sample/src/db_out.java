import java.sql.*;


public class db_out {

    public static void main(String[] args) throws Exception
    {
        String s="xvouvghv";
    Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost", "system", "system");
        String query2 = "select * from logger where eid='"+s+"'";
        Statement st2 = con.createStatement();
        ResultSet rs = st2.executeQuery(query2);
    while (rs.next()) {
            System.out.println(rs.getString(2));
        }
    }

}
