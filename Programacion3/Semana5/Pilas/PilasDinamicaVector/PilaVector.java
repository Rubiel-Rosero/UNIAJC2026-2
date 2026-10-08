package Pilas.PilasDinamicaVector;
import java.util.Vector;
public class PilaVector {
    private static final int Inicial = 19;
    private int cima;
    private Vector listaPila;

    public PilaVector()
    {
        cima = -1;
        listaPila = new Vector(Inicial);
    }
    public void insertar(Object elemento) throws Exception
    {
        cima++;
        listaPila.addElement(elemento);
    }
    public void mostrarPila()
    {
        for(int i = 0; i <= cima; i++)
        {
            System.out.println(listaPila.elementAt(i));
        }
    }
    public Object eliminar() throws Exception
    {
        Object aux;
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no se puede eliminar");
        }
        aux = listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
    }
    //Quitar un elemento específico de la pila
    public void eliminarElemento(double d) throws Exception
    {
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no se puede eliminar");
        }
        for(int i = cima; i >= 0; i--)
        {
            if(listaPila.elementAt(i).equals(d))
            {
                listaPila.removeElementAt(i);
                cima--;
                System.out.println("Elemento " + d + " eliminado de la pila.");
                return;
            }
        }
        throw new Exception("Elemento no encontrado en la pila");
    }
    public Object cimaPila() throws Exception
    {
        if(pilaVacia())
        {
            throw new Exception("Pila vacia, no se puede consultar la cima");
        }
        return listaPila.elementAt(cima);
    }
    public boolean pilaVacia()
    {
        return (cima == -1);
    }
    public void limpiarPila() throws Exception
    {
        while(!pilaVacia())
            eliminar();
    }

    /*
    Para utilizar una pila de elementos de tipo primitivo (int, char, long, float, double...)
    es necesario, para insertar, crear un objeto de la correspondiente clase envolvente (Integer,
    Character, Long, Float, Double...) y pasar dicho objeto como argumento del método insertar().
    */
}
