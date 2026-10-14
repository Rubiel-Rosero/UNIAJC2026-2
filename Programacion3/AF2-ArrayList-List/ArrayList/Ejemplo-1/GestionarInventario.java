import java.util.ArrayList;
import java.util.List;

public class GestionarInventario
{
    private List<Producto> listaProductos;
    public GestionarInventario()
    {
        this.listaProductos = new ArrayList<>();
    }
    public void agregarProducto(Producto p)
    {
        listaProductos.add(p);
    }
    public void agregarProductoEnPosicion(int index, Producto p)
    {
        if(index >= 0 && index <= listaProductos.size())
        {
            listaProductos.add(index, p);
        }
    }
    public int ObtenerTotalProductos()
    {
        return listaProductos.size();
    }
    public Producto obtenerProducto(int index)
    {
        if(index >= 0 && index < listaProductos.size())
        {
            return listaProductos.get(index);
        }
        return null;
    }
    public List<Producto> getListaProductos()
    {
        return listaProductos;
    }
}
