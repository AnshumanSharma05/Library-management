import java.sql.*;
import javax.swing.JOptionPane;

public class Javaconnect{
    Connection conn;      
    public static Connection connecrDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/library","Anshuman_05","paskiambm");
            return conn;
            
        }catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
}
