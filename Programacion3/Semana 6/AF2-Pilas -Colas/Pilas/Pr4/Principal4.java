import java.util.ArrayDeque;
import java.util.Scanner;

public class Principal4
{
    public static void main(String args[])
    {
        GestionPilas gs = new GestionPilas();
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MANEJO DE 5 PILAS (P1 - P5) ===");
        System.out.println("Ingrese pares de enteros (i, j):");
        System.out.println("k = -1 : Borra todos los elementos de la Pila Pi");
        System.out.println("k = 0 : Operación normal (i > 0 inserta j, i < 0 elimina)");
        System.out.println("i = 0 : Termina el programa\n");

        boolean continuar = true;
        while (continuar)
        {
            gs.mostrarPilas();
            System.out.print("Ingrese i (pila/operación): ");
            int i = sc.nextInt();

            if (i == 0)
            {
                continuar = false;
                continue;
            }

            int j = 0;
            int k = 0;
            System.out.print("Ingrese j (valor): ");
            j = sc.nextInt();
            System.out.print("Ingrese k (modo: -1 = vaciar, 0 = normal): ");
            k = sc.nextInt();

            continuar = gs.procesarTrio(i, j, k);
        }

        gs.mostrarPilas();
        sc.close();
    }
}

class GestionPilas
{
    private final ArrayDeque<Integer>[] pilas;

    @SuppressWarnings("unchecked")
    public GestionPilas()
    {
        pilas = new ArrayDeque[5];
        for (int i = 0; i < pilas.length; i++)
        {
            pilas[i] = new ArrayDeque<>();
        }
    }

    public boolean procesarTrio(int i, int j, int k)
    {
        int indice = Math.abs(i) - 1;

        if (indice < 0 || indice >= pilas.length)
        {
            System.out.println("Pila fuera de rango.");
            return true;
        }

        if (k == -1)
        {
            pilas[indice].clear();
            return true;
        }

        if (k == 0)
        {
            if (i > 0)
            {
                pilas[indice].push(j);
            }
            else if (i < 0)
            {
                if (!pilas[indice].isEmpty())
                {
                    pilas[indice].pop();
                }
            }
            return true;
        }

        System.out.println("Modo no válido. Use -1 o 0.");
        return true;
    }

    public void mostrarPilas()
    {
        System.out.println("\nEstado de las pilas:");
        for (int i = 0; i < pilas.length; i++)
        {
            System.out.println("P" + (i + 1) + ": " + pilas[i]);
        }
    }
}

