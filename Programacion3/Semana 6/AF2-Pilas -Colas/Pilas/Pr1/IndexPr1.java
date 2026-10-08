import java.util.Scanner;
public class IndexPr1
{
    public static void main(String[] args)
    {
        Problema1 pro1 = new Problema1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el texto a evaluar");
        String cadena = sc.nextLine();
        while(!cadena.equalsIgnoreCase("salir"))
        {
            boolean esValido = Problema1.esformaXY(cadena);
            if(esValido)
            {
                System.out.println("-&gt; ¡Aceptada! La cadena cumple con la estructura X &amp; Y.\\n");
            }else
            {
                System.out.println("-&gt; Rechazada. La cadena NO cumple con la estructura X &amp; Y.\\n");
            }
            System.out.print("Ingrese otra cadena (o 'salir' para terminar): ");
            cadena = sc.nextLine();
        }
        System.out.println("Programa finalizado."); 
        sc.close();
    }
}
