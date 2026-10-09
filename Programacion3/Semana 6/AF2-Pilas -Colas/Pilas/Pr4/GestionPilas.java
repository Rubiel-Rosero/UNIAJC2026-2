/*
Modificar el programa del Problema 9.4 para que la entrada sean triplos de números
enteros (i,j,k), donde i, j tienen el mismo significado que en 9.4, y k es un número
entero que puede tomar los valores –1, 0 con este significado:
• -1, hay que borrar todos los elementos de la pila.
• 0, el proceso es el indicado en el Problema 9.4 con i y j.
*/
import java.util.Stack;
public class GestionPilas
{
    private static final int n = 5; // Numero de las pilas
    private Stack<Integer>[] pilas;

    @SuppressWarnings("unchecked")// Con esta anotacion le damos la intruccion directa al compilador de Java que ignore la advertencia (warning) en este caso las advertencias relativas a operaciones no verificadas (unchecked operations)
    public GestionPilas()
    {
        pilas = new Stack[n];
        for(int k = 0; k < n; k++)
        {
            pilas[k] = new Stack<>();
        }
    }
    //
    public boolean procesarTrio(int i, int j, int k)
    {
        if(i == 0)
        {
            return false; //Condicion para dar fin
        }
        int absI = Math.abs(i);//Calcular el valor absoluto de numero que se encuntre en la i
        if(absI < 1 || absI > n)
        {
            System.out.println("Error: El índice i debe estar entre -" + n + " y " + n + " (excluyendo 0).");
            return true;
        }
        int indicePila = absI - 1; //Ajuste a indice de Java (0 a 4)
        if(k == -1)
        {
            pilas[indicePila].clear();
        }
        else if(k == 0)
        {
            if(i > 0)
            {
            //Insertar j en la pila Pi
            pilas[indicePila].push(j);
            System.out.println("Insertado " + j + " en Pila P" + absI);
            }else
            {   //Eliminar elemento de la pila Pi
                if(!pilas[indicePila].isEmpty())
                {
                    int eliminado = pilas[indicePila].pop();
                    System.out.println("Eliminado " + eliminado + " de Pila P" + absI);
                }else
                {
                    System.out.println("Advertencia: Pila P" + absI + " está vacía, no se puede eliminar.");
                }
            }
        }
        else
        {
            System.out.println("Error: El valor de k debe ser -1 (vaciar) o 0 (normal).");
        } 
        return true;
    }
    //Mostrar el contenido de todas las pilas
    public void mostrarPilas()
    {
        System.out.println("\n=== CONTENIDO FINAL DE LAS 5 PILAS ===");
        for (int k = 0; k < n; k++)
        {
            System.out.println("Pila P" + (k + 1) + ": " + pilas[k]);
        }
    }

}
