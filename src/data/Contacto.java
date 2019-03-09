package data;

public class Contacto extends Persona{

    
    private String correo;
    private String telefono;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return getNombre()+" - "+ correo +" - "+ getDocumento();
    }

    public Contacto(String correo, String telefono, String nombre, String documento) {
        super(nombre, documento);
        this.correo = correo;
        this.telefono = telefono;
    }
   
}
