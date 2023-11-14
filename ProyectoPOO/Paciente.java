package ProyectoPOO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Paciente extends Persona { 
    private String sintomas; 
    private String medicamentosConsumidos; 

    public Paciente (int id, String nombre, String sintomas, String medicamentosConsumidos) { 
        super(id, nombre); 
        this.sintomas=sintomas; 
        this.medicamentosConsumidos=medicamentosConsumidos; 
    } 

    public String getSintomas() {
        return this.sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getMedicamentosConsumidos() {
        return this.medicamentosConsumidos;
    }

    public void setMedicamentosConsumidos(String medicamentosConsumidos) {
        this.medicamentosConsumidos = medicamentosConsumidos;
    } 
    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", Nombre='" + getNombre() + "'" +
            ", sintomas='" + getSintomas() + "'" +
            ", medicamentosConsumidos='" + getMedicamentosConsumidos() + "'" +
            "}";
    }

    //metodos... 
    public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Nombre: " + nombre +
                ", Síntomas: " + sintomas + ", Medicamentos Consumidos: " + medicamentosConsumidos);
    }

    //mostrar el listado de pacientes... 
    public static void mostrarPacientes(int id) {
        try (Connection conexion = Conexion.obtenerConexion();
             PreparedStatement pstmt = conexion.prepareStatement("SELECT * FROM pacientes WHERE id =?");
            ) {
                pstmt.setInt(1, id); 
                ResultSet rs = pstmt.executeQuery();
            System.out.println("Registros de Pacientes:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Nombre: " + rs.getString("nombre") +
                        ", Síntomas: " + rs.getString("sintomas") +
                        ", Medicamentos Consumidos: " + rs.getString("medicamentos_consumidos"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al mostrar registros de pacientes.");
        }
    } 
    //metodo para actualizar los sintomas de un paciente... 
    public static void actualizarSintomasEnBD(String sintomas, int id) {
        try (Connection conexion = Conexion.obtenerConexion();
             PreparedStatement pstmt = conexion.prepareStatement("UPDATE pacientes SET sintomas = ? WHERE id = ?")) {
            pstmt.setString(1, sintomas);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al actualizar los síntomas en la base de datos.");
        }
    }
}
