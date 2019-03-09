package data;

public class Usuario extends Persona{
    
    private String contraseña;
    private int numContactos;

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNumContactos() {
        return numContactos;
    }

    public void setNumContactos(int numContactos) {
        this.numContactos = numContactos;
    }
    
    @Override
    public String toString() {
        return ("Usuario{" + "contraseña=" + contraseña + ", numContactos=" + numContactos + '}');
    }

    public Usuario(String contraseña, int numContactos, String nombre, String documento) {
        super(nombre,documento);
        this.contraseña = contraseña;
        this.numContactos = numContactos;
    }

    public Usuario(String contraseña, String nombre, String documento) {
        super(nombre, documento);
        this.contraseña = contraseña;
    }
    

}
