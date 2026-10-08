/*
La clase NodoPila representa un nodo de la lista enlazada. Tiene dos atributos: elemento
guarda el elemento de la pila y siguiente contiene la dirección del siguiente nodo de la lista.
El constructor pone el dato en elemento e inicializa siguiente a null. El tipo de dato de
elemento se corresponde con el tipo de los elementos de la pila para que no dependa de un tipo
concreto; para que sea más genérico, se utiliza el tipo Object y, de esa forma, puede almacenar
cualquier tipo de referencia
*/
public class NodoPila{
    Object elemento;
    NodoPila siguiente;
    
    NodoPila(Object x)
    {
        elemento = x;
        siguiente = null;
    }
}