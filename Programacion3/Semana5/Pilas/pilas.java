package Pilas;
/*
Las pilas son estructuras de datos que siguen el principio LIFO 
(Last In, First Out), lo que significa que el último elemento 
agregado a la pila es el primero en ser removido. 
En Java, podemos implementar una pila utilizando 
la clase Stack de la biblioteca estándar. 

A continuación, se muestra un ejemplo básico de cómo
crear y utilizar una pila en Java.
*/
import java.util.Stack;

public class pilas {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
        System.out.println("Pila creada: " + pila);
        System.out.println("La pila está vacía: " + pila.isEmpty());// Verifica si la pila está vacía
        pila.push(10); // Agrega un elemento a la pila
        pila.push(20); // Agrega otro elemento a la pila
        pila.push(30); // Agrega otro elemento a la pila   
        System.out.println("Pila después de agregar elementos: " + pila);
        System.out.println("Elemento en la cima de la pila: " + pila.peek()); // Muestra el elemento en la cima de la pila
        System.out.println("Elemento removido de la pila: " + pila.pop()); // Remueve el elemento en la cima de la pila
        System.out.println("Pila después de remover un elemento: " + pila);
        
        
        for (Integer elemento : pila) {
            System.out.println("Elemento en la pila: " + elemento);
        }

        System.out.println("Buscar un elemento en la pila: " + pila.search(20)); // Busca un elemento en la pila
    }
}
