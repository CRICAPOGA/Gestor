package Controlador;

//Gestor de Tareas

import Modelo.Tarea;
import java.util.ArrayList;
import java.util.Scanner;

public class Parcial1 {
    public ArrayList<Tarea> array=new ArrayList();
    private Scanner sc= new Scanner(System.in);
    public Tarea t;
    private String des;
    private String estado="Incompleto";
    private int con=0;


    public void agregarTarea() {
        if(array.size() <= 4){
            System.out.println("Descripción: ");
            des=sc.nextLine();
            t=new Tarea(des);
            array.add(t);
        }else{
            System.out.println("Max");
        }
    }
    
    public void marcarTareaCompletada(int i) {
        t=array.get(i-1);
        t.setEstado(true);
        array.set(i-1, t);
    }
    
    public void mostrarTareasCompletadas() {
        System.out.println("TAREAS");
        for(Tarea i: array){
            con++;
            System.out.println(con+". "+i.getDesccripcion()+"              || "+validarEstado(i.getEstado()));
        }
        con=0;
    }
    
    private String validarEstado(boolean e) {
        if (e){
            estado="Completado";
        }
        return estado;
    }

}
