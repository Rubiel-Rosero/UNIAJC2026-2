package Colas;
/*
las colas son estructuras de datos que siguen el principio FIFO
(First In, First Out), lo que significa que el primer elemento
en llegar es el primero en salir.
En Java, podemos implementar una cola utilizando la clase Queue de la biblioteca estándar.
A continuación, se muestra un ejemplo básico de cómo 
crear y utilizar una cola en Java.
*/
import java.util.Queue;
import java.util.LinkedList;// Importa la clase LinkedList para implementar la cola porque la clase Queue es una interfaz y no se puede instanciar directamente.
public class colas {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        System.out.println("Cola creada: " + cola);
        System.out.println("La cola está vacía: " + cola.isEmpty());// Verifica si la cola está vacía
        cola.add(1); // Agrega un elemento a la cola
        cola.add(2);
        cola.offer(3); // Agrega otro elemento a la cola pero con la diferencia de que si la cola está llena, no lanza una excepción, sino que devuelve false.
        System.out.println("Cola después de agregar elementos: " + cola);
        System.out.println("Elemento en la cabeza de la cola: " + cola.peek()); // Muestra el elemento en la cabeza de la cola
        System.out.println("Elemento en la cabeza de la cola: " + cola.element()); // Muestra el elemento en la cabeza de la cola pero lanza una excepción si la cola está vacía.
        System.out.println("Elemento removido de la cola: " + cola.poll()); // Remueve el elemento en la cabeza de la cola
        System.out.println("Elemento removido de la cola: " + cola.remove()); // Remueve el elemento en la cabeza de la cola pero lanza una excepción si la cola está vacía.
        System.out.println("Cola después de remover un elemento: " + cola); 
        System.out.println("Buscar un elemento en la cola: " + cola.contains(2)); // Busca un elemento en la cola
        System.out.println("Tamaño de la cola: " + cola.size()); // Muestra el tamaño de la cola
        //System.out.println("Vaciar la cola: " + cola.clear()); // Vacía la cola
        
    }
}
