package Modelo;

// @author camil
public class Tarea {
    
    //Variables
    private String desccripcion;
    private boolean estado;
    
    //Constructores
    public Tarea() {}

    public Tarea(String desccripcion) {
        this.desccripcion = desccripcion;
        this.estado = false;
    }
    
    //Getter/Setter

    public String getDesccripcion() {
        return desccripcion;
    }

    public void setDesccripcion(String desccripcion) {
        this.desccripcion = desccripcion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}