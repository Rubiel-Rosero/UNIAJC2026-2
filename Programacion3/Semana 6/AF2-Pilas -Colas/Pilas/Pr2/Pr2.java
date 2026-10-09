/*
Escribir un programa que, haciendo uso de una Pila, procese cada uno de los caracteres de una expresión que viene dada en una línea. La finalidad es verificar el
equilibrio de paréntesis, llaves y corchetes. Por ejemplo, la siguiente expresión tiene
un número de paréntesis equilibrado:
((a+b)*5) - 7
A esta otra expresión le falta un corchete: 2*[(a+b)/2.5 + x - 7*y
*/
import java.util.Stack;
public class Pr2
{
    public boolean estaEquilibrado(String expresion)
    {
        Stack<Character> pila = new Stack<>();
        for(int i = 0; i < expresion.length(); i++)
        {
            char letra = expresion.charAt(i);
            if(letra == '(' || letra == '[' || letra == '{')
            {
                pila.push(letra);
            }else if(letra == ')' || letra == ']' || letra == ']')
            {
                if(pila.isEmpty())
                {
                    return false;
                }
                char ultimoApertura = pila.pop();   

                if(!esParValido(ultimoApertura, letra))
                {
                    return false;
                }
            }
            
        }
        return pila.isEmpty();
        
    }
    //Metodo axiliar para verificar si son pareja o no
    private boolean esParValido(char apertura, char cierre)
    {
        return ((apertura == '(' && cierre == ')') || (apertura == '[' && cierre == ']') || (apertura == '{' && cierre == '}'));
    }
}
