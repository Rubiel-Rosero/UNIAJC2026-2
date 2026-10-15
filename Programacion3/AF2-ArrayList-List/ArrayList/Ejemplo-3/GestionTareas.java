import java.util.ArrayList;
import java.util.List;
public class GestionTareas
{
    private List<Tarea> listaTareas;
    public GestionTareas()
    {
        this.listaTareas = new ArrayList<>();
    }
    public void agregarTarea(Tarea t)
    {
        listaTareas.add(t);
    }
    public boolean completarTarea(int indice)
    {
        if(indice >= 0 && indice < listaTareas.size())
        {
            listaTareas.get(indice).marcarCompletada();
            return true;
        }
        return false;
    }
    public Tarea eliminarTarea(int indice)
    {
        if(indice >= 0 && indice < listaTareas.size())
        {
            return listaTareas.remove(indice);
        }
        return null;
    }
    public List<Tarea> getListaTareas()
    {
        return listaTareas;
    }
    public boolean estaVacia()
    {
        return listaTareas.isEmpty();
    }
}
