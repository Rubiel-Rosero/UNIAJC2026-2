package Pilas;

import java.io.*;

public class Palindromo {
    public static void main(String[] args){
        Ejercicio2 pilaChar;
        char ch;
        boolean esPal = false;
        String palabra;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try{
            pilaChar = new Ejercicio2();//
            System.out.println("Ingrese una palabra o frase: ");   
            palabra = entrada.readLine();
            
            for(int i = 0; i < palabra.length(); i++){
                ch = palabra.charAt(i);
                pilaChar.insertar(ch);
            }
            esPal = true;
            for(int j = 0; j < palabra.length(); j++){
                Character c;
                c = (Character) palabra.charAt(j);// Obtiene el carácter en la posición j de la palabra
                esPal = palabra.charAt(j++) == c.charValue();// Compara el carácter en la posición j de la palabra con el carácter en la cima de la pila
            }
            pilaChar.vaciarPila();
            if(esPal){
                System.out.println("La palabra o frase es un palíndromo");
            } else {
                System.out.println("La palabra o frase no es un palíndromo");
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
