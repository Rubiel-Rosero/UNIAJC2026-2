
import java.util.ArrayList;
import java.util.List;

public class GestionEstudiantes
{
    private List<Estudiante> listaEstudiantes;
    public GestionEstudiantes()
    {
        this.listaEstudiantes = new ArrayList<>();
    }
    public void registrar(Estudiante e)
    {
        listaEstudiantes.add(e);
    }
    public Estudiante buscarPorCodigo(String codigo)
    {
        Estudiante auxiliar = new Estudiante(codigo, "", 0.0);
        int indice = listaEstudiantes.indexOf(auxiliar);
        if(indice != -1)
        {
            return listaEstudiantes.get(indice);
        }
        return null;
    }
    public boolean eliminarPorCodigo(String codigo)
    {
        return listaEstudiantes.remove(new Estudiante(codigo, "", 0.0));
    }
    public List<Estudiante> getListaEstudiantes()
    {
        return listaEstudiantes;
    }
}
