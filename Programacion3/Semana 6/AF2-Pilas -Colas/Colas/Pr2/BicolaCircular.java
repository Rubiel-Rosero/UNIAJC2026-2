public class BicolaCircular
{
    private static final int TAM = 9; //capacidad fija de 9
    private char[] array;
    private int frente;
    private int fin;
    private int numElementos;
    public BicolaCircular()
    {
        array = new char[TAM];
        //frente = 5, fin = 7 y bicola = A,B,C
        frente = 5;
        fin = 7;
        array[5] = 'A';
        array[6] = 'B';
        array[7] = 'C';
        numElementos = 3;
    }
    public boolean estaLlena()
    {
        return numElementos == TAM;
    }
    public boolean estaVacia()
    {
        return numElementos == 0;
    }
    //añadimos el caracter por el fin de la bicola y despues avanza el puntero final
    public boolean insertarFinal(char c)
    {
        if(estaLlena())
        {
            System.out.println("[ERROR - OVERFLOW] No se puede añadir '" + c + "' por el final: Bicola llena.");
            return false;
        }
        fin = (fin + 1) % TAM;
        array[fin] = c;
        numElementos++;
        return true;
    }
    //añadimos el caracter por el frente de la bicola y retrocede el puntero Frente
    public boolean insertarFrente(char c)
    {
        if(estaLlena())
        {
            System.out.println("[ERROR - OVERFLOW] No se puede añadir '" + c + "' por el frente: Bicola llena.");
            return false;
        }
        frente = (frente - 1 + TAM) % TAM;
        array[frente] = c;
        numElementos++;
        return true;
    }
    //eliminar y retornar el caracter por el frente
    public Character eliminarFrente()
    {
        if(estaVacia())
        {
            System.out.println("[ERROR - UNDERFLOW] Bicola vacía.");
            return null;
        }
        char eliminado = array[frente];
        array[frente] = ' '; // limipieza visual del arreglo
        frente = (frente + 1) % TAM;
        numElementos--;
        return eliminado;
    }
    //mostrar los punteros y el estado del arreglo con el contenido
    public void mostrarEstado(String paso)
    {
        System.out.println("--------------------------------------------------");
        System.out.println("PASO: " + paso);
        System.out.println("Frente = " + frente + " | Fin = " + fin + " | Ocupados = " + numElementos + "/" + TAM);
        //arreglo vista
        System.out.print("Arreglo [0..8]: [ ");
        for(int i = 0; i < TAM; i++)
        {
            char val = array[i] == '\0' || array[i] == ' ' ? '_' : array[i];
            System.out.print(val + (i < TAM - 1 ? ", " : " "));
        }
        System.out.println("]"); 
        //ver elementos desde el frente hasta el fin
        System.out.print("Bicola (Frente -&gt; Fin): ");
        if(estaVacia())
        {
            System.out.println("Vacia");
        }else
        {
            int actual = frente;
            for(int i = 0; i < numElementos; i++)
            {
                System.out.print(array[actual] + (i < numElementos - 1 ? ", " : ""));
                actual = (actual + 1) % TAM;
            }
            System.out.println();
        }
    }
}
