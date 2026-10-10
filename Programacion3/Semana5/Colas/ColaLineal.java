package Colas;
/*
La clase ColaLineal contiene un array (listaCola) cuyo máximo tamaño se determina
por la constante MAXTAMQ. El tipo de los elementos queda sin especificar (TipoDeDato), para
que pueda sustituirse por un tipo simple, o bien por Object. Los atributos frente y fin son los
punteros de cabecera y cola (fin), respectivamente. El constructor de la clase inicializa una cola
vacía y define el array: new TipoDeDato [MAXTAMQ].

La operación insertar toma un elemento y lo añade al final de la cola. quitar suprime y
devuelve el elemento de la cabeza de la cola. La operación frente devuelve el elemento que está
en la primera posición (frente) de la cola, sin eliminar el elemento.
La operación de control colaVacia comprueba si la cola tiene elementos, ya que es necesaria
esta comprobación antes de eliminar un elemento. La operación colaLlena comprueba si la cola
está llena, esta comprobación se realiza antes de insertar un nuevo miembro. Si las precondiciones para insertar y quitar se violan, el programa debe generar una excepción o error.
*/
/*
public class ColaLineal
{
    private static fin int MAXTMQ = 39;
    protected int frente;
    protected int fin;
    protected TipoDeDato [] listaCola;//TipoDeDato no es un tipo definido, se debe sustituir ese identificador por el tipo verdadero de los elementos.
    public ColaLineal()
    {
        frente = 0;
        fin = -1;
        listaCola = new TipoDeDato [MAXTMQ];
    }
    //operaciones de modificacion de la cola
    public void insertar(TipoDeDato elemento) throws Exception
    {
        if(!colaLlena())
        {
            listaCola[++fin] = elemento;
        }else
        {
            throw new Exception("Overflow en la cola");
        }
    }
    public TipodeDato quitar() throws Exception
    {
        if(!colaVacia())
        {
            return listaCola[frente++];
        }else
        {
            throw new Exception("Cola vacia");
        }
    }
    public void borrarCola()
    {
        frente = 0;
        fin = -1;
    }
    //acceso a la cola
    public TipoDeDato frenteCola() throws Exception
    {
        if(!colaVacia())
        {
            return listaCola[frente];
        }else
        {
            throw new Exception("Cola vacia");
        }
    }
    // metodos de verificacion del estado de la cola
    public boolean colaVacia()
    {
        return frente > fin;
    }
    public boolean colaLLena()
    {
        return fin == MAXTMQ-1;
    }
}
/*
Otra cuestión más importante es que esta
implementación de una cola es notablemente ineficiente, ya que se puede alcanzar la condición de
cola llena existiendo elementos del array sin ocupar. Esto se debe a que, al realizar la operación de
quitar un elemento, avanza el frente y, por consiguiente, las posiciones anteriores quedan desocupadas, no accesibles. Una solución a este problema consiste en que al retirar el elemento, frente
no se incremente y, a la vez, se desplacen el resto de elementos una posición a la izquierda. 
*/
