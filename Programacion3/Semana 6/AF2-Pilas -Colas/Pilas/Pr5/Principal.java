import java.util.Scanner;
public class Principal
{
    public static void main(String[] args)
    {
        ValidadorPalindromo validador = new ValidadorPalindromo();
        Scanner sc = new Scanner(System.in);
        System.out.println("=== VERIFICADOR DE PALÍNDROMOS (PILA + LISTA CIRCULAR) ===");
        System.out.println("Ingrese líneas o frases para evaluar (escriba 'salir' para terminar):\n");
        while(true)
        {   
            System.out.print("Línea:  ");
            String linea = sc.nextLine();
            if(linea.equalsIgnoreCase("salir"))
            {
                break;
            }
            boolean esPal = validador.esPalindromo(linea);
            if(esPal)
            {
                System.out.println("¡ES UN PALÍNDROMO!\n");
            }else
            {
                System.out.println("NO es un palíndromo.\n");
            }
        }
        System.out.println("Programa finalizado."); 
        sc.close();
    }
}
