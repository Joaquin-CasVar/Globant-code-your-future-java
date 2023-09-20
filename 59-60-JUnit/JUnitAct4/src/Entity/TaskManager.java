package Entity;

// @author Haze
import java.util.ArrayList;

public class TaskManager {

    private ArrayList<String> listaTareas = new ArrayList<>(0);

    public void agregarTarea(String tarea) {
        listaTareas.add(tarea);
    }

    public void eliminarTarea(String tarea) {
        listaTareas.remove(tarea);
    }

    public void listarTareas() {
        System.out.println("Lista de Tareas ");
        listaTareas.forEach((tarea) -> System.out.println(tarea));
    }
    
    public int cantTareas() {
        return listaTareas.size();
    }

}
