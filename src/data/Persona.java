package data;

public class Persona implements Interfaz{
    
    private String nombre;
    private String documento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public Persona(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", documento=" + documento + '}';
    }
    
    @Override
    public void decidir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
