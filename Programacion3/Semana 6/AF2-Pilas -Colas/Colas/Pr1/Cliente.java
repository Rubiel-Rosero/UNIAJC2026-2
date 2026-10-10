// cliente del supermercado
public class Cliente
{

    private int id;
    private Carrito carrito;

    public Cliente(int id)
    {
        this.id = id;
        this.carrito = null;
    }

    public int getId()
    {
        return id;
    }

    public Carrito getCarrito()
    {
        return carrito;
    }

    public void asignarCarrito(Carrito carrito)
    {
        this.carrito = carrito;
    }

    public Carrito liberarCarrito()
    {
        Carrito c = this.carrito;
        this.carrito = null;
        return c;
    }

    @Override
    public String toString()
    {
        return "Cliente #" + id + (carrito != null ? " [" + carrito + "]" : "");
    }
}
