package ProyectoPOO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion { 
    private static final String URL = "jdbc:mysql://localhost:3306/proyectosss"; 
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "";
    //esta es la parte donde vamos a obtener la conexion... 
    public static Connection obtenerConexion(){ 
        try{ 
            return DriverManager.getConnection(URL,USUARIO,CONTRASEÑA); 
        }catch(SQLException e){ 
            e.printStackTrace();
            throw new RuntimeException("Error en la conexion con la base de datos..." + e); 
        }
    }
}
