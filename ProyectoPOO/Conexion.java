package ProyectoPOO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc://localhost:3306/proyectoss"; 
    //esta es la parte donde vamos a obtener la conexion... 
    public static Connection obtenerConexion(){ 
        try{ 
            return DriverManager.getConnection(URL); 
        }catch(SQLException e){ 
            e.printStackTrace();
            throw new RuntimeException("Error en la conexion con la base de datos..."); 
        }
    }
}
