package ProyectoPOO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Farmacia{  
    private int id;  
    private String ubicaciones; 
    
    //constructor...    
    public Farmacia (String ubicaciones, int id) {   
        this.id=id; 
        this.ubicaciones=ubicaciones; 
    }
/* 
    //metodos para agregar una farmacia... 
    public void agregarFarmacia (String NombreFarmacia) { 
        ListadoFarmacias.add(NombreFarmacia); 
    } 
    */  

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicaciones() {
        return this.ubicaciones;
    }

    public void setUbicaciones(String ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", ubicaciones='" + getUbicaciones() + "'" +
            "}";
    }

    //metodos...
     public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Ubicaciones: " + ubicaciones);
    }

    public static void mostrarFarmacias() {
        try (Connection conexion = Conexion.obtenerConexion();
             PreparedStatement pstmt = conexion.prepareStatement("SELECT * FROM farmacia");
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Registros de Farmacias:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Ubicaciones: " + rs.getString("ubicaciones"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al mostrar registros de farmacias.");
        }
    }

}