package ProyectoPOO;
import java.util.ArrayList; 
import java.util.List;
import java.util.concurrent.LinkedTransferQueue; 
public class Farmacia { 
    private String NombreFarmacia; 
    private List<String> ListadoFarmacias; 

    //constructor...    
    public Farmacia (String NombreFarmacia) {  
        this.NombreFarmacia = NombreFarmacia; 
        this.ListadoFarmacias = new ArrayList<>(); 
    }

    //metodos para agregar una farmacia... 
    public void agregarFarmacia (String NombreFarmacia) { 
        ListadoFarmacias.add(NombreFarmacia); 
    }
}