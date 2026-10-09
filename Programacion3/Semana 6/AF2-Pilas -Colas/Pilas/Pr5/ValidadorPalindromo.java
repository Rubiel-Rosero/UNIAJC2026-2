public class ValidadorPalindromo
{
    public boolean esPalindromo(String linea)
    {
        Pila pila = new Pila();
        ListaCircular listaCircular = new ListaCircular();
        //Normalizar la cadena
        String textoLimpio = normalizarTexto(linea);
        if(textoLimpio.isEmpty())
        {
            return false;
        }
        //Añadir cada caracter a la pila y a la lista circular por el final
        for(int i = 0; i < textoLimpio.length(); i++)
        {
            char c = textoLimpio.charAt(i);
            pila.push(c);
            listaCircular.insertarFinal(c);
        }
        //extraer caracter por caracter simultaneamente  y comparar 
        while(!pila.esVacia() && !listaCircular.esVacia())
        {
            char charPila = pila.pop();//inverso
            char charLista = listaCircular.quitarPrimero();//directo
            if(charPila != charLista)
            {
                return false;//si algun caracter no es igual entonces no es polindromo
            }
        }
        return true;
    }
    //omitir espacios, signos de puntuacion y tildes para evaluar las frases completas
    private String normalizarTexto(String texto)
    {
        StringBuilder sb = new  StringBuilder();//modifica el texto internamente mediante el método append() sin crear nuevos objetos, optimizando enormemente el rendimiento y el uso de memoria
        for(int i = 0; i < texto.length(); i++)
        {
            char c = Character.toLowerCase(texto.charAt(i));
            if(Character.isLetterOrDigit(c))
            {
                switch(c)
                {
                    case 'á': c = 'a'; break;
                    case 'é': c = 'e'; break;
                    case 'í': c = 'i'; break;
                    case 'ó': c = 'o'; break;
                    case 'ú': c = 'u'; break;
                }
                sb.append(c);
            }
        }
        return sb.toString();
    } 
}
