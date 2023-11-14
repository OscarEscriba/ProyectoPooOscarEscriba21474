package ProyectoPOO;

import java.util.Scanner;
public class Principal {
    private static Scanner teclado = new Scanner(System.in); 
    public static void main (String[] args){ 
        System.out.println("Bienvenido al Sistema medico"); 
        //mandar a llamar el metodo de incio de sesion.... logica de autenticacion interna... 
        Persona usuarioAut = realizarLogin();  
        if (usuarioAut instanceof Medico) {
            System.out.println("¡Bienvenido Dr. " + usuarioAut.getNombre() + "!");
            Medico doctor = (Medico) usuarioAut;
            mostrarOperacionesDoctor(doctor); // la parte de doctor se refiere al objeto de tipo Medico que se llama doctor...
        } else if (usuarioAut instanceof Paciente) {
            System.out.println("¡Bienvenido " + usuarioAut.getNombre() + "!");
            Paciente paciente = (Paciente) usuarioAut;
            mostrarOperacionesPaciente(paciente);//la parte de paciente se refiere a un ojeto de tipo Paciente que se llama paciente... 
        } else {
            System.out.println("Credenciales incorrectas. Saliendo...");
        }
} 
private static Persona realizarLogin(){  
    //ingresar las credenciales... 
    System.out.println("Ingrese su usuario: "); 
    String usuario = teclado.nextLine(); 

    System.out.println("Ingresa la contrasenia: "); 
    String password = teclado.nextLine(); 

    //realizar la logica de autenticacion... 
    if ("JuanP".equals(usuario) && "Juan1234".equals(password)){ 
        return new Medico(1, "Juan P","Cardiologia","Hospital A");
    }else if ("OscarEs".equals(usuario) && "Oscar1234".equals(password)) { 
        return new Paciente(2, "OscarEs", "Dolor de cabeza", "Ibuprofeno"); 
    }else { 
        System.out.println("Credenciales invalidad, vuelve a intentar..."); 
        System.exit(0); 
        return null; 
    }
}
//metodos para mandar a llamar los metodos en todas las siguientes clases... 
} 
