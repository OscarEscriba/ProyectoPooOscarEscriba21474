package ProyectoPOO;
import java.util.ArrayList; 
import java.util.List; 
public class Paciente {
    private String Nombre; 
    private List<String> SintomasAnteriores; 
    private List<String> NuevoSintomas; 
    private List<String> medicamentosConsumidos;
    private List<String> medicamentosActuales; 

    //Constructor 
    public Paciente(String Nombre) { 
        this.Nombre = Nombre; 
        this.SintomasAnteriores = new ArrayList<>(); 
        this.NuevoSintomas = new ArrayList<>(); 
        this.medicamentosConsumidos= new ArrayList<>(); 
        this.medicamentosActuales=new ArrayList<>(); 
    } 
    //Metodos para agregar sintomas y medicamentos 
    public void agregarSintomasAnterior (String sintoma) { 
        SintomasAnteriores.add(sintoma); 
    }

    public void agregarNuevoSintoma(String sintoma) { 
        NuevoSintomas.add(sintoma);
    } 

    public void agregarMedicamentoConsumido (String medicamento){ 
        medicamentosConsumidos.add(medicamento); 
    } 

    public void agregarMedicamentoActual(String medicamento){ 
        medicamentosActuales.add(medicamento); 
    } 
}
