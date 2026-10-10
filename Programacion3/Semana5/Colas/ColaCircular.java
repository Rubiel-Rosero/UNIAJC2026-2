package Colas;
/*
La clase declara los apuntadores frente, fin y el array listaCola[]. Para obtener la siguiente posición de una dada aplicando la teoría de los restos, se escribe el método siguiente().
A continuación, se codifican los métodos que implementan las operaciones del TAD Cola.
Ahora el tipo de los elementos es Object, de tal forma que se pueda guardar cualquier tipo de
elementos.
*/
/*
public class ColaCircular
{
    private static fin int MAXTAMQ = 99;
    protected int frente;
    protected int fin;
    protected Object [] listaCola;
    // avanza un posicion
    private int siguiente(int r)
    {
        return (r+1) % MAXTAMQ-1;
    }
    //inicializa la cola vacia
    public ColaCircular()
    {
        frente = 0;
        fin = MAXTAMQ-1;
        listaCola = new Object[MAXTAMQ];
    }
    //operacion de modificacion de la cola
    public void insertar(Object elemento) throws Exception
    {
        if(!colaLlena())
        {
            fin = siguiente(fin);
            listaCola[fin] = elemento;
        }else
        {
            throw new Exception("Overflow en la cola");
        }
    }
    public Object quitar()throws Exception
    {
        if(!colaVacia())
        {
            Object tm = listaCola[frente];
            frente = siguiente(frente);
            return tm;
        }else
        {
            throw new Exception("Cola vacia ");
        }
    }
    public void borrarCola()
    {
        frente = 0;
        fin = MAXTAMQ-1;
    }
    //accesa a la cola
    public Object frenteCola() throws Exception
    {
        if(!colaVacia())
        {
            return listaCola[frente];
        }else
        {
            throw new Exception("Cola vacia ");
        }
    }
    //metodos de verificacion del estado de la cola
    public boolean colaVacia()
    {
        return frente == siguiente(fin);
    }
    //comprueba si esta llena
    public boolean colaLlena()
    {
        return frente == siguiente(siguiente(fin));
    }
}
*/
