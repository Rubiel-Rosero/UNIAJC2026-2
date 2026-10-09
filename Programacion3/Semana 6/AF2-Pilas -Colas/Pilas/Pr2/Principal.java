import java.util.Scanner;
public class Principal
{
    public static void main (String args[])
    {
        Pr2 validarExpresion = new Pr2();  
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una expresion para evaluar: ");
        String expresion = sc.nextLine();
        while(!expresion.equalsIgnoreCase("si"))
        {
            boolean equilibrada = validarExpresion.estaEquilibrado(expresion);
            if(equilibrada)
            {
                System.out.println("La expresión está CORRECTAMENTE equilibrada.");
            }else
            {
                System.out.println("La expresión está DESEQUILIBRADA.");
            }
            System.out.print("Ingrese otra expresión (o 'salir'): ");
            expresion = sc.nextLine();
        }
        System.out.println("Programa finalizado."); 
        sc.close();
    }
}
