/*
La clase PilaLista implementa las operaciones del TAD Pila. Además, dispone del atributo cima que es la dirección (referencia) al primer nodo de la lista. El constructor inicializa la
pila vacía (cima = null), realmente, a la condición de lista vacía.
*/
import Pilas.PilayNodoPila.NodoPila;
public class PilaLista {
    private NodoPila cima;
    public PilaLista()
    {
        cima = null;
    }
    //Operaciones
    public boolean pilaVacia()
    {
        return cima == null;
    }
    public void insertar(Object elemento)
    {
        NodoPila nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

}
