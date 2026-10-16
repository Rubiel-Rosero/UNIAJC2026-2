/*
aquí administramos la fila de clientes.
*/
import java.util.LinkedList;
public class Panaderia
{
    private LinkedList<Cliente> filaClientes = new LinkedList<>();
    public void registrarCliente(String nombre)
    {
        Cliente cliente = new Cliente(nombre);
        filaClientes.addLast(cliente);
        System.out.println("Cliente registrado correctamente");
    }
    public void atenderCliente()
    {
        if(filaClientes.isEmpty())
        {
            System.out.println("No hay clientes para atender");
            return;
        }
        Cliente cliente = filaClientes.removeFirst();
        System.out.println("Atendiendo a: " + cliente.getNombre());
    }
    public void mostrarFila()
    {
        if(filaClientes.isEmpty())
        {
            System.out.println("La fila esta vacia");
            return ;
        }
        System.out.println("\nClientes en espera: ");
        for(int i = 0; i < filaClientes.size(); i++)
        {
            System.out.println((i + 1) + " " + filaClientes.get(i));
        }
    }
    public void mostrarCantidad()
    {
        System.out.println("Cliente esperando: " + filaClientes.size());
    }
}
