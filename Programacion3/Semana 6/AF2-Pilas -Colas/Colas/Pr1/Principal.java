import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Supermercado superm = new Supermercado();
        Scanner sc = new Scanner(System.in);
        int contadorClientes = 1;
        boolean salir = false;
        System.out.println("=================================================");
        System.out.println("  SIMULACIÓN INTERACTIVA DE SUPERMERCADO (COLAS)  ");
        System.out.println("=================================================");
        while (!salir)
        {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Registrar llegada de cliente");
            System.out.println("2. Cliente termina sus compras y entra a caja");
            System.out.println("3. Atender cliente en caja (1, 2 o 3)");
            System.out.println("4. Ver estado actual del supermercado");
            System.out.println("5. Salir del programa");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            switch (opcion)
            {
                case 1:
                    // Registra un nuevo cliente con ID autoincrementable
                    Cliente nuevoCliente = new Cliente(contadorClientes++);
                    superm.llegaCliente(nuevoCliente);
                    break;
                case 2:
                    System.out.print("Ingrese el ID del cliente que terminó de comprar: ");
                    int idCliente = sc.nextInt();
                    // Crea el cliente para pasarlo a caja
                    Cliente clienteCompra = new Cliente(idCliente);
                    // Simula que tiene un carrito asignado
                    clienteCompra.asignarCarrito(new Carrito(idCliente));
                    superm.clienteTerminaCompra(clienteCompra);
                    break;
                case 3:
                    System.out.print("Ingrese el número de caja a atender (1, 2 o 3): ");
                    int numCaja = sc.nextInt();
                    superm.atenderEnCaja(numCaja);
                    break;
                case 4:
                    superm.mostrarEstado();
                    break;
                case 5:
                    salir = true;
                    System.out.println("\n¡Gracias por utilizar la simulación de supermercado!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }

    sc.close();
    }
}