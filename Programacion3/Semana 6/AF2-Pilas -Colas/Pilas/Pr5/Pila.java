/*
Se quieren determinar las frases que son palíndromo, para lo cual se ha de seguir la
siguiente estrategia: considerar cada línea de una frase; añadir cada carácter de la
frase a una pila y, a la vez, a lista enlazada circular por el final; extraer carácter a
carácter, simultáneamente de la pila y de la lista circular el primero, su comparación
determina si es palíndromo o no. Escribir un programa que lea líneas y determine si
son palíndromo.
*/
public class Pila
{
    private static class Nodo
    {
        char dato;
        Nodo siguiente;
        public Nodo(char dato)
        {
            this.dato = dato;
            this.siguiente = null;
        }
    }
    private Nodo cima;
    public Pila()
    {
        this.cima = null;
    }
    public boolean esVacia()
    {
        return cima == null;
    }
    //Aplicar el push en la cima
    public void push(char c)
    {
        Nodo nuevo = new Nodo(c);
        nuevo.siguiente = cima;
        cima = nuevo;
    }
    public char pop()
    {
        if(esVacia())
        {
            throw new IllegalStateException("La pila está vacía");//
        }
        char dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }
}