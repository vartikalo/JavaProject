import java.sql.*;
import javax.swing.JOptionPane;

public class db {
    static Connection con;
    static String rptName;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/pos3","root","");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return(con);
    }
}


/*import java.sql.*;
public class db {
    static Connection con;
     public static  Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/pos","root","");
        }
        catch(Exception e){
            System.out.println(e);
        }
         return(con);
    }
   
}

 * 
 * 
 * 
 */