package CRUD;
    import java.sql.*;

public class koneksi {
    public static Connection fungsikoneksi() throws SQLException{
        Connection conn = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/crudjava";
        String user = "root";
        String pass = "";
        
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Koneksi Database berhasil");
        } catch (ClassNotFoundException ex) {
          
            System.out.println("Koneksi Database gagal");
        }
        return conn;
    }
}
