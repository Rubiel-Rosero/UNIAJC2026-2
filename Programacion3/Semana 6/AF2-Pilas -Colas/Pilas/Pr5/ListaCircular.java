public class ListaCircular
{
    private static class Nodo
    {
        char dato;
        Nodo enlace;
        public Nodo(char dato)
        {
            this.dato = dato;
            this.enlace = this; //apunta a el mismo
        }
    }
    private Nodo lc;//Apunta al ultimo nodo de la lista circular
    public ListaCircular()
    {
        this.lc = null;
    }
    public boolean esVacia()
    {
        return lc == null;
    }
    //Insertar un caracter al final de la lista circular
    public void insertarFinal(char c)
    {
        Nodo nuevo = new Nodo(c);
        if(esVacia())
        {
            lc = nuevo;
        }else
        {
            nuevo.enlace = lc.enlace;//nuevo apunta al primer nodo
            lc.enlace = nuevo;//el antiguo ultimo apunta al nuevo
            lc = nuevo;//el nuevo nodo pasa a ser el ultimo
        }
    }
    //extraer el y eliminar el primer caracter 
    public char quitarPrimero()
    {
        if(esVacia())
        {
            throw new IllegalStateException("La lista circular está vacía");//es una excepción en tiempo de ejecución (RuntimeException)que se lanza cuando se invoca un método en un momento en que el programa u objeto se encuentra en un estado no válido o ilegal
        }
        Nodo primero = lc.enlace;//el primer nodo es el siguiente del ultimo
        char dato =primero.dato;
        if(lc == lc.enlace)//solo habia un nodo   
        {
            lc = null;
        }else
        {
            lc.enlace = primero.enlace; // Se desvincula el primer nodo
        }
        return dato;
    }
}
