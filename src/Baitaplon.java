import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Baitaplon {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/btl?autoReconnect=true&&useSSL=false";
        String username = "root";
        String password = "Thanhnam@2307";
        Class.forName("com.mysql.jdbc.Driver");
        //Connection
        Connection connect = DriverManager.getConnection(url, username, password);
        if(connect == null){
            System.out.println("F");
        }
        else{
            System.out.println("Y");
        }
        
        Statement stm = (Statement) connect.createStatement();
        String s="DELETE FROM Movie where Name_Film='Squid Game'";
        int n=stm.executeUpdate(s);
        System.out.println(n);
    }
}