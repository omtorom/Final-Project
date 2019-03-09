package gui;

import data.Contacto;
import data.Usuario;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class GUI {
    
    public static void ingresarUsuario(String contraseña, HashMap <String,Usuario> listaUsuarios){
    if (listaUsuarios.containsKey(contraseña)){
        String nombre =listaUsuarios.get(contraseña).getNombre();
        System.out.print("Bienvenid@ a tu agenda personal "+nombre);        
    }else{
        System.out.println("Usuario o contraseña incorrectos");
    }
    }
    
    public static void registrarUsuario(String contraseña, String nombre, String documento, HashMap <String,Usuario> listaUsuarios){
        if (listaUsuarios.containsKey(contraseña)){
        System.out.println("El usuario ya existe");        
    }else{
        Usuario usuario = new Usuario(contraseña, nombre, documento);
        listaUsuarios.put( contraseña, usuario );
        System.out.println("Contacto Creado Exitosamente");
    }
    }

   public static void guardarContacto(String telefono, String correo, String direccion, String nombre, HashMap <String,Contacto> listaContactos){
    if (listaContactos.containsKey(telefono)) {
        System.out.println("No se puede guardar el Contacto. El Número de Teléfono ya esta registrado.");
    } else {
        Contacto c = new Contacto(correo,telefono,nombre,direccion);
        listaContactos.put( telefono, c );
        System.out.println("Contacto Creado Exitosamente");
    }
} 
   public static void guardarContactoO(String telefono, String correo, String direccion, String nombre, String apellido, TreeMap <String,Contacto> listaContactosT){
    if (listaContactosT.containsKey(telefono)) {
        System.out.println("No se puede guardar el Contacto. El Número de Teléfono ya esta registrado.");
    } else {
        Contacto c = new Contacto(correo,telefono,nombre,direccion);
        listaContactosT.put(telefono,c);
    }
} 
   public static void modificaContacto(String telefono, HashMap<String,Contacto> listaContactos){
    Scanner sc = new Scanner(System.in);
   if (listaContactos.containsKey(telefono)) {
               String name = JOptionPane.showInputDialog("Seleccione el dato que deseas modificar: "
               + "\n1. Nombre"
               + "\n2. Teléfono"
               + "\n3. Documento"
               + "\n4. Correo"
               + "\n5. Eliminar todos los datos");
       int opcion = Integer.parseInt(name);
        switch (opcion) {
            case 1:
                String suname = JOptionPane.showInputDialog("Escriba el nuevo nombre del Contacto: ");
                listaContactos.get(telefono).setNombre(suname);  // Permite Cambiar a variable nombre 
                break;
            case 2:
                String suname1 = JOptionPane.showInputDialog("Escriba el nuevo número de teléfono del Contacto: ");
                listaContactos.get(telefono).setTelefono(suname1);
                break;
            case 3:
                String suname2 = JOptionPane.showInputDialog("Escriba EL NUEVO DOCUMENTO del Contacto: ");
                listaContactos.get(telefono).setDocumento(suname2);
                break;
            case 4:
                String suname3 = JOptionPane.showInputDialog("Escriba el nuevo correo electronico del Contacto: ");
                listaContactos.get(telefono).setCorreo(suname3);
                break;
            case 5:
                eliminaContacto(telefono,listaContactos);
                break;
            default:
                break;
        }
   }
 }
    public static void mostrarContacto(HashMap<String, Contacto> listaContactos){
    String clave;
    Iterator<String> contactos = listaContactos.keySet().iterator();
    System.out.println("Has guardado los siguientes Contactos: ");
    System.out.println("|  Telefono  |  Nombre  |  Correo  |  Direccion |");
    while(contactos.hasNext()){
        clave = contactos.next();
        System.out.println(clave + " - " + listaContactos.get(clave));
    }        
}
   public static void eliminaContacto(String telefono, HashMap<String,Contacto> listaContactos) {
    if (listaContactos.containsKey(telefono)){
        listaContactos.remove(telefono);
        System.out.println("Contacto Eliminado Exitosamente");
    } else {//Mensaje de negacion
        System.out.println("No hay ningún contacto registrado con ese Número de Teléfono.");  
    }  
   }  
}


