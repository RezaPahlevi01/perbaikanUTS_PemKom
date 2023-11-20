
import java.sql.Connection;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

public class Koneksi {
    public static Connection bukaCon(){
       try {
           MysqlDataSource kont = new MysqlDataSource();
           kont.setDatabaseName("perbaikanUTS");
           kont.setUser("root");
           kont.setPassword("");
           kont.setServerName("localhost");
           kont.setPort(3306);
           kont.setServerTimezone("Asia/Jakarta");
           Connection c = kont.getConnection();
           return c;
       } catch (Exception e) {
       }
       return null;
   }
    
}
