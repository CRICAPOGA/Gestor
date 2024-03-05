package Vista;

import Controlador.Parcial1;
import Modelo.Tarea;
import java.util.Scanner;

public class Gestor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parcial1 p = new Parcial1();
        int n;
        int con;
        String des="n";
        //Mostrar tareas
        p.mostrarTareasCompletadas();
        
        System.out.println("=======================================");
        //Agregar las tareas
        do{            
            p.agregarTarea();
            System.out.println("Agregar otra tarea (S/N)");
            des=sc.next().toLowerCase();
        } while (des.charAt(0)!='n');
        
        //Marcar tareas incompletas
        do{
            System.out.println("Desea completar una tarea? (s/n)"); 
            des=sc.next().toLowerCase();
            if (des.charAt(0)=='s'){
                p.mostrarTareasCompletadas();
                System.out.println("Escribe el numero de la tarea que se desea completar: ");
                n=sc.nextInt();
                p.marcarTareaCompletada(n);
            }
        } while (des.charAt(0)!='n');
        
        System.out.println("=======================================");
        p.mostrarTareasCompletadas();
    }
}