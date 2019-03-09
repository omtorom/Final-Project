package businessLogic;

import java.util.HashMap;
import java.util.Scanner;
import data.Contacto;
import data.Usuario;
import static gui.GUI.*;

public class Agenda {

    public static void main(String[] args) {
        
    HashMap<String,Usuario> listaUsuarios = new HashMap<>();    
    HashMap<String,Contacto> listaContactos = new HashMap<>();
    
    Usuario usuario1 = new Usuario("123", 3,"Oscar Toro", "1001");
    listaUsuarios.put(usuario1.getContraseña(),usuario1);
      
    Scanner sc = new Scanner(System.in);
    int opcionElegida = 0; 
    String telefono; 
    String nombre;
    String documento;
    String correo;
    String usuario;
    String contraseña;
    
    
    while (opcionElegida != 3){
        System.out.println("        MI AGENDA, MIS CONTACTOS");
        System.out.println("Introduce el numero de la opción que quieras:");
        System.out.println("1.- Ingresar");
        System.out.println("2.- Registrarse");
        System.out.println("3.- Salir");
        opcionElegida = Integer.valueOf(sc.nextLine());
        
        switch (opcionElegida){
            case 1: 
                System.out.println("Por favor, ingrese usuario");
                usuario = sc.nextLine();
                System.out.println("Por favor, ingrese contraseña");
                contraseña = sc.nextLine();
                ingresarUsuario(contraseña,listaUsuarios);
        
                while (opcionElegida != 4) {
        System.out.println("        MI AGENDA, MIS CONTACTOS");
        System.out.println("              Menú Principal");
        System.out.println("Introduce el numero de la opción que quieras:");
        System.out.println("1.- Crear Contacto");
        System.out.println("2.- Modificar Contacto");
        System.out.println("3.- Mostrar todos mis Contactos"); 
        System.out.println("4.- Salir");
        opcionElegida = Integer.valueOf(sc.nextLine());

        switch (opcionElegida) {
            case 1:
                System.out.print("Numero de Teléfono del Contacto:  ");
                telefono = sc.nextLine(); 
                System.out.println("Nombres y Apellidos del Contacto:");
                nombre = sc.nextLine();
                System.out.println("Correo del Contacto:");
                correo = sc.nextLine();;
                System.out.println("Documento del Contacto:");
                documento = sc.nextLine();
                guardarContacto(telefono,correo,documento,nombre,listaContactos);
                break;
            case 2:
                System.out.println("Ingrese el Número de Teléfono del Contacto que desea modificar: ");
                telefono = sc.nextLine();
                modificaContacto(telefono, listaContactos);
                 
                break;
            case 3:
                mostrarContacto(listaContactos);
         
                break;
            case 4:
                 System.out.println("Vuelva pronto!");
                break;
            default:
                System.out.println("Error. Por favor introduce una opción valida");
        }
    }
                break;
                
            case 2:
                System.out.println("Por favor, ingrese nombre de usuario");
                usuario = sc.nextLine();
                System.out.println("Por favor, ingrese numero de documento");
                documento = sc.nextLine();
                System.out.println("Por favor, ingrese contraseña");
                contraseña = sc.nextLine();
                
                registrarUsuario(contraseña,usuario,documento,listaUsuarios);
                break;
        }

    }

    }    

   
}

