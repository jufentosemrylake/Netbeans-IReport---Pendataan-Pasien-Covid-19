package koneksi;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Koneksi {
    public static Connection getConections;
    public static Connection koneksiDB(){
        if (getConections == null) {
            try{
                String DB = "jdbc:mysql://localhost:3306/prauasoop2";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                getConections = (Connection) DriverManager.getConnection(DB,user,pass);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        return getConections;
    }
}
