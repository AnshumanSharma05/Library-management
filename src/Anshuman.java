

/**
 *
 * @author Anshuman Sharma
 */
    import java.sql.*;
    public class Anshuman {

    public static void main(String[] args) {
        try{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/Lab","Anshuman_05","paskiambm");
            
            Statement statement = connect.createStatement();
            
            ResultSet result;
            result = statement.executeQuery("SELECT * FROM LAB");
            while(result.next()){
                System.out.println(result.getString(1)+","+result.getInt(2)+","+result.getInt(3));
            }
            

            statement.executeUpdate("DELETE FROM LAB WHERE NAME = 'Jitmanyu Shandilya' ");
result = statement.executeQuery("SELECT * FROM Lab");

            //step5: close the connections
            connect.close();
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
            }
        }



