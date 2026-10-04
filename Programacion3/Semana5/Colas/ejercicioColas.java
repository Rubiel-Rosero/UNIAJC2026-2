/*
Estas desarrollando el sistema para el centro de atencion
telefonica (call center). Cuando los clientes llaman,
el sistema no puede atenderlos a todos al mismo tiempo,
asi que pone una linea de espera. Los operadores deben atender
a los clientes en el orden en que llamaron.
*/
package Colas;
import java.util.Queue;
import java.util.LinkedList;
public class ejercicioColas {
    public static void main(String[] args) {
        Queue<String> colaClientes = new LinkedList<>();
        // Agregar clientes a la cola
        colaClientes.add("Cliente 1");
        colaClientes.add("Cliente 2");
        colaClientes.add("Cliente 3");
        System.out.println("Cola de clientes: " + colaClientes);
        // Atender a los clientes en el orden en que llamaron
        while (!colaClientes.isEmpty()) {
            String clienteAtendido = colaClientes.poll(); // Remueve el primer cliente de la cola
            System.out.println("Atendiendo a: " + clienteAtendido);
        }
        System.out.println("Todos los clientes han sido atendidos.");
    }
}