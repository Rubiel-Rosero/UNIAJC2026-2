/*Arreglos: 7,8,9,10,11,12 -> si piden muchos numero llenar con numeros aleatorios

Arreglo #9: codifique un programa tal, que dado como entrada un arreglo unidimensional
de enteros y un numero entero, determine cuantas veces se encuentra este numero dentro del
arreglo.
*/
import java.util.Scanner;
public class A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creacion del arreglo y lectura de los 10 numeros enteros
        int[] arreglo = new int[10];
        System.out.println("Ingrese 10 numeros enteros:");

        for (int i = 0; i < 10; i++) {
            arreglo[i] = sc.nextInt();
        }

        //Lectura del numero entero a buscar en el arreglo
        System.out.print("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        int contador = 0;

        //
        for (int i = 0; i < 10; i++) {
            if (arreglo[i] == numero) {
                contador++;
            }
        }
        System.out.println("El numero " + numero + " se encuentra " + contador + " veces en el arreglo.");
    }
}
