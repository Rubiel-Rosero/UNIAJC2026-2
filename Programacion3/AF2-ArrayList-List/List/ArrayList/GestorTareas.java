/*
aqui se administra todos lo objetos como tal de la tarea
*/
import java.util.ArrayList;
import java.util.List;
public class GestorTareas
{
    private List<Tarea> tareas = new ArrayList<>();
    public void agregarTarea(String descripcion)
    {
        Tarea nuevaTarea = new Tarea(descripcion);
        tareas.add(nuevaTarea);
        System.out.println("Tarea agregada correctamente");
    }
    public void mostrarTareas()
    {
        if(tareas.isEmpty())
        {
            System.out.println("No hay tareas pendientes");
            return;
        }
        for(int i = 0; i < tareas.size(); i++)
        {
            System.out.println((i + 1) + " " + tareas.get(i));
        }
    }
    public void eliminarTarea(int numero)
    {
        if(numero < 1 || numero > tareas.size())
        {
            System.out.println("Numero de tarea invalido");
            return;
        }
        tareas.remove(numero - 1);
        System.out.println("Tarea eliminada correctamente");
    }
    public void completarTarea(int numero)
    {
        if(numero < 1 || numero > tareas.size())
        {
            System.out.println("Numero de tarea invalido");
            return;
        }
        tareas.get(numero - 1).completar();
        System.out.println("Tarea completada correctamente");
    }
}
