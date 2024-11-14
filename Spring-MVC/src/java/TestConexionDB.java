import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class TestConexionDB {

    public static void main(String[] args) {
        try {
            // Registra el driver JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // URL de la base de datos, usuario y contraseña
            String url = "jdbc:mysql://localhost:3306/registro";
            String user = "root";  // O el usuario que uses en MySQL
            String password = "";  // O la contraseña que uses
            
            // Establece la conexión
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");
            
            // Cierra la conexión
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
    }
}
