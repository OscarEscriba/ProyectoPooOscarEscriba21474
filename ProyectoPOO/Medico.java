package ProyectoPOO;

public class Medico { 
    private String Nombre; 
    private String Especialiad;  
    private int ZonaDeUbicacion; 

    public Medico() { 
        Nombre=""; 
        Especialiad=""; 
        ZonaDeUbicacion=0; 
    } 

    public Medico(String Nombre, String Especialiad, int ZonaDeUbicacion) { 
        this.Nombre=Nombre; 
        this.Especialiad=Especialiad; 
        this.ZonaDeUbicacion=ZonaDeUbicacion; 
    } 


    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEspecialiad() {
        return this.Especialiad;
    }

    public void setEspecialiad(String Especialiad) {
        this.Especialiad = Especialiad;
    }

    public int getZonaDeUbicacion() {
        return this.ZonaDeUbicacion;
    }

    public void setZonaDeUbicacion(int ZonaDeUbicacion) {
        this.ZonaDeUbicacion = ZonaDeUbicacion;
    }


    @Override
    public String toString() {
        return "{" +
            " Nombre='" + getNombre() + "'" +
            ", Especialiad='" + getEspecialiad() + "'" +
            ", ZonaDeUbicacion='" + getZonaDeUbicacion() + "'" +
            "}";
    }

} 
