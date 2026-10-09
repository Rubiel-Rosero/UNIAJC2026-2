import java.util.Scanner;
public class Principal3
{
    public static void main(String args[])
    {
        GestorPilas gestor = new GestorPilas();
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MANEJO DE 5 PILAS (P1 - P5) ===");
        
        System.out.println("Ingrese pares de enteros (i, j):");
        System.out.println("i > 0 : Inserta j en Pila Pi");
        System.out.println("i < 0 : Elimina de Pila Pi");
        System.out.println("i = 0 : Termina el programa\n");
        boolean continuar = true;
        while(continuar)
        {   
            gestor.mostrarPilas();
            System.out.print("Ingrese i (pila/operación): ");
            int i = sc.nextInt();
            int j = 0;
            if(i != 0)
            {
                System.out.print("Ingrese j (valor): ");
                j = sc.nextInt();
            }
            continuar = gestor.procesarPar(i, j);
            
        }
        gestor.mostrarPilas();
        sc.close();
    }
}
