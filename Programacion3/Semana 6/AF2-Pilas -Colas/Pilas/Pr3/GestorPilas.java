/*
Escribir un programa en el que se manejen un total de n = 5 pilas: P1, P2, P3, P4
y P5. La entrada de datos serán pares de enteros (i,j) tal que 1 ≤ abs(i) ≤ n. De
tal forma que el criterio de selección de pila será:
• Si i es positivo, debe insertarse el elemento j en la pila Pi.
• Si i es negativo, debe eliminarse el elemento j de la pila Pi.
• Si i es cero, fin del proceso de entrada.
Los datos de entrada se introducen por teclado. Cuando termina el proceso el programa debe escribir el contenido de la n Pilas en pantalla.
*/
import java.util.Stack;
public class GestorPilas
{
    private static final int n = 5; // Numero de las pilas
    private Stack<Integer>[] pilas;

    @SuppressWarnings("unchecked")// Con esta anotacion le damos la intruccion directa al compilador de Java que ignore la advertencia (warning) en este caso las advertencias relativas a operaciones no verificadas (unchecked operations)
    public GestorPilas()
    {
        pilas = new Stack[n];
        for(int k = 0; k < n; k++)
        {
            pilas[k] = new Stack<>();
        }
    }
    //
    public boolean procesarPar(int i, int j)
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
        if(i > 0)
        {   //Insertar j en la pila Pi
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
