package ProyectoPOO;

public class Persona {
    protected int id; 
    protected String nombre; 

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }


    public boolean autenticar(String usuario, String contraseña) {
        return nombre.equals(usuario) && nombre.equals(contraseña);
    }
}
