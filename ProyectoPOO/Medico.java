package ProyectoPOO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Medico extends Persona {  
    private String Especialiad;  
    private String ZonaDeUbicacion; 

   /* public Medico() { 
        Nombre=""; 
        Especialiad=""; 
        ZonaDeUbicacion=0; 
    } 
*/ 
    public Medico(int id, String Nombre, String Especialiad, String ZonaDeUbicacion) {  
        super(id, Nombre); 
        this.Especialiad=Especialiad; 
        this.ZonaDeUbicacion=ZonaDeUbicacion;  
    } 

    public String getEspecialiad() {
        return this.Especialiad;
    }

    public void setEspecialiad(String Especialiad) {
        this.Especialiad = Especialiad;
    }

    public String getZonaDeUbicacion() {
        return this.ZonaDeUbicacion;
    }

    public void setZonaDeUbicacion(String ZonaDeUbicacion) {
        this.ZonaDeUbicacion = ZonaDeUbicacion;
    }

    // metodos... 
    public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Nombre: " + nombre +
                ", Especialidad: " + Especialiad + ", Ubicación: " + ZonaDeUbicacion);
    } 

    //metodo para mostar el listado de doctores... 
    public static void mostrarDoctores() {
        try (Connection conexion = Conexion.obtenerConexion();
             PreparedStatement pstmt = conexion.prepareStatement("SELECT * FROM medico");
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Listado de Doctores:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Nombre: " + rs.getString("nombre") +
                        ", Especialidad: " + rs.getString("especialidad") +
                        ", Ubicación: " + rs.getString("ubicacion"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al mostrar listado de doctores.");
        }
    }  

    //mostrar doctores por especialidad... 
    public static void mostrarDoctoresPorEspecialidad(String especialidad) {
        try (Connection conexion = Conexion.obtenerConexion();
             PreparedStatement pstmt = conexion.prepareStatement("SELECT * FROM medico WHERE especialidad = ?");
        ) {
            pstmt.setString(1, especialidad);
            ResultSet rs = pstmt.executeQuery();
            System.out.println("Doctores con especialidad " + especialidad + ":");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Nombre: " + rs.getString("nombre") +
                        ", Especialidad: " + rs.getString("especialidad") +
                        ", Ubicación: " + rs.getString("ubicacion"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al mostrar doctores por especialidad.");
        }
    }

    @Override
    public String toString() {
        return "{" +
            ", Especialiad='" + getEspecialiad() + "'" +
            ", ZonaDeUbicacion='" + getZonaDeUbicacion() + "'" +
            "}";
    }
    

} 
