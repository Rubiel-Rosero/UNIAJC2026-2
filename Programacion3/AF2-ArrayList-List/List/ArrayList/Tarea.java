/*
Donde se representa cada tarea que se quiere guardar
*/
public class Tarea
{
    private String descripcion;
    private boolean completada;
    public Tarea(String descripcion)
    {
        this.descripcion = descripcion;
        this.completada = false;
    }
    public String getDescripcion()
    {
        return descripcion;
    }
    public boolean esCompletada()
    {
        return completada;
    }
    public void completar()
    {
        completada = true;
    }
    @Override 
    public String toString()
    {
        String estado = completada ? "Completada" : "Pendiente";
        return descripcion + " - " + estado;
    }
}
