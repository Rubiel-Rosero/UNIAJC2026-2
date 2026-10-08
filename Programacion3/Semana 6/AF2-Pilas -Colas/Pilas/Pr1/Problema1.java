/*
Escribir un método para determinar si una secuencia de caracteres de entrada es de
la forma:
X & Y
siendo X una cadena de caracteres e Y la cadena inversa. El carácter & es el separador
*/
import java.util.Stack;
public class Problema1
{
    //Determinar si la cadena de entrada es de la firma X & Y

    public static boolean esformaXY(String cadena)
    {
        Stack<Character> pila = new Stack<>();
        int i = 0;
        int n = cadena.length();
        //Apilar los caracteres de X hasta encontrar '&'
        while (i < n && cadena.charAt(i) != '&')
        {
            pila.push(cadena.charAt(i));
            i++;
        }
        //Si no se encontro el & pero se llego al final
        if(i == n || cadena.charAt(i) != '&')
        {
            return false;
        }
        i++;//Entonces se omite el separador
        //Comparamos los caracters de Y con los extraidos de la pila
        while(i < n)
        {   //Si la pila esta vacia pero aun existen caracters en Y
            if(pila.isEmpty())
            {
                return false;
            }
            char caracterX = pila.pop();
            char caracterY = cadena.charAt(i);
            if(caracterX != caracterY)
            {
                return false;//Es decir que no coinciden los caracteres
            }
            i++;
        }
        //Al final la pila deberia estar completamente vacia
        return pila.isEmpty();
    }
}
