package Pilas;
/*
Escribir un programa que utilice una Pila para comprobar si una determinada frase/palabra
(cadena de caracteres) es un palíndromo. Nota: una palabra o frase es un palíndromo cuando la
lectura directa e indirecta de la misma tiene igual valor: alila, es un palíndromo; cara (arac) no
es un palíndromo.
*/
import java.io.*;
public class Ejercicio2 {
    private static final int TAMPILA = 79;
    private int cima;
    private Object[] listaPila;

    public Ejercicio2() {
        cima = -1;// Inicializa la cima de la pila en -1, indicando que está vacía
        listaPila = new Object[TAMPILA];
    }

    public void insertar(Object elemento) throws Exception {
        if(pilaLlena()) {
            throw new Exception("Desbordamiento de Pila");
        }
        cima++;
        listaPila[cima] = elemento;// Inserta el elemento en la cima de la pila
    }
    public Object eliminar() throws Exception {
        Object aux;
        if(pilaVacia()) {
            throw new Exception("Pila vacia, no se puede eliminar");
        }
        aux = listaPila[cima];// Guarda el elemento en la cima de la pila
        cima--;
        return aux;// Elimina y devuelve el elemento en la cima de la pila
    }
    public Object cimaPila() throws Exception {
        if(pilaVacia()) {
            throw new Exception("Pila vacia, no se puede consultar la cima");
        }
        return listaPila[cima];// Devuelve el elemento en la cima de la pila
    }
    public boolean pilaVacia() {
        return (cima == -1);// Devuelve true si la pila está vacía, false en caso contrario
    }
    public boolean pilaLlena() {
        return (cima == TAMPILA - 1);// Devuelve true si la pila está llena, false en caso contrario
    }
    public void vaciarPila() {
        cima = -1;// Vacía la pila estableciendo la cima en -1
    }
}
