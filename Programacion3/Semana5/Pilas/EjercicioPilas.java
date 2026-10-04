package Pilas;
/*
Invertir el orden de un conjunto de elementos.
Escribir un programa que reciba una palabra,
introdusca cada una de sus letras en una pila y luego
las saque para formar la palabra al reves.
*/
import java.util.Stack;
import java.util.Scanner;
public class EjercicioPilas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Character> pila = new Stack<Character>();
        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();
        for (int i = 0; i < palabra.length(); i++) {// Recorre cada letra de la palabra
            pila.push(palabra.charAt(i));// Agrega cada letra a la pila charAt(i) = obtiene el caracter en la posición i de la palabra
        }
        System.out.println("Buscar letra: " +  pila.search('o'));
        String palabraInvertida = "";
        while (!pila.isEmpty()) {// Mientras la pila no esté vacía
            palabraInvertida += pila.pop();//
        }
        System.out.println("Palabra invertida: " + palabraInvertida);
    }
}
