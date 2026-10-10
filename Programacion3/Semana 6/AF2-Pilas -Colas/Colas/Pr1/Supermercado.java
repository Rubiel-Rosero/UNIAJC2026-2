import java.util.LinkedList;
import java.util.Queue;
public class Supermercado
{
    private Queue<Carrito> carritosDisponibles;
    private Queue<Cliente> colaEsperaCarritos;
    private Queue<Cliente>[] cajas;
    private static final int TOTAL_CARRITOS = 25;
    private static final int TOTAL_CAJAS = 3;
    public Supermercado()
    {
        carritosDisponibles = new LinkedList<>();
        colaEsperaCarritos = new LinkedList<>();
        cajas = new LinkedList[TOTAL_CAJAS];

        // Crear los 25 carritos disponibles
        for (int i = 1; i <= TOTAL_CARRITOS; i++)
        {
            carritosDisponibles.offer(new Carrito(i));
        }

        // Crear las colas de las 3 cajas
        for (int i = 0; i < TOTAL_CAJAS; i++)
        {
            cajas[i] = new LinkedList<>();
        }
    }

    // Registrar la llegada de un cliente
    public void llegaCliente(Cliente cliente)
    {
        System.out.println("\nLlega " + cliente.getId() + " al supermercado.");
        if (!carritosDisponibles.isEmpty())
        {
            Carrito carrito = carritosDisponibles.poll();
            cliente.asignarCarrito(carrito);
            System.out.println("Se asignó el " + carrito + " al Cliente #" + cliente.getId());
        } else
        {
            colaEsperaCarritos.offer(cliente);
            System.out.println("No hay carritos disponibles. Cliente #" + cliente.getId() + " queda esperando.");
        }
    }

    // El cliente termina sus compras y entra a una caja
    public void clienteTerminaCompra(Cliente cliente)
    {
        Carrito carrito = cliente.liberarCarrito();
        if (carrito == null)
        {
            System.out.println("El Cliente #" + cliente.getId() + " no tiene un carrito asignado.");
            return;
        }
        // Elegir la caja con menos clientes
        int cajaMenor = 0;
        for (int i = 1; i < TOTAL_CAJAS; i++)
        {
            if(cajas[i].size() < cajas[cajaMenor].size())
            {
                cajaMenor = i;
            }
        }
        cajas[cajaMenor].offer(cliente);
        System.out.println("Cliente #" + cliente.getId() + " entra a la caja " + (cajaMenor + 1) + ".");
        // Devolver el carrito o asignarlo a quien espera
        devolverCarrito(carrito);
    }

    // Devolver un carrito al sistema
    private void devolverCarrito(Carrito carrito)
    {
        if (!colaEsperaCarritos.isEmpty())
        {
            Cliente siguiente = colaEsperaCarritos.poll();
            siguiente.asignarCarrito(carrito);
            System.out.println("El " + carrito + " se asigna al Cliente #" + siguiente.getId() + " que estaba esperando.");
        }else
        {
            carritosDisponibles.offer(carrito);
            System.out.println("El " + carrito + " queda disponible nuevamente.");
        }
    }
    // Atender al siguiente cliente de una caja
    public void atenderEnCaja(int numeroCaja)
    {
        if(numeroCaja < 1 || numeroCaja > TOTAL_CAJAS)
        {
            System.out.println("Número de caja inválido. Use 1, 2 o 3.");
            return;
        }
        Queue<Cliente> caja = cajas[numeroCaja - 1];
        if(caja.isEmpty())
        {
            System.out.println("La caja " + numeroCaja + " no tiene clientes.");
        }else
        {
            Cliente atendido = caja.poll();
            System.out.println("Se atendió al Cliente #" + atendido.getId() + " en la caja " + numeroCaja + ".");
        }
    }
    // Mostrar el estado actual del supermercado
    public void mostrarEstado()
    {
        System.out.println("\n======================================");
        System.out.println("       ESTADO DEL SUPERMERCADO");
        System.out.println("======================================");
        System.out.println("Carritos disponibles: " + carritosDisponibles.size());
        System.out.println("Clientes esperando carrito: " + colaEsperaCarritos.size());
        for (int i = 0; i < TOTAL_CAJAS; i++)
        {
            System.out.println("\nCaja " + (i + 1) + ": " + cajas[i].size() + " cliente(s)");
            if(cajas[i].isEmpty())
            {
                System.out.println("  Sin clientes.");
            }else
            {
                for(Cliente cliente : cajas[i])
                {
                    System.out.println("  " + cliente);
                }
            }
        }

        System.out.println("======================================\n");
    }
}