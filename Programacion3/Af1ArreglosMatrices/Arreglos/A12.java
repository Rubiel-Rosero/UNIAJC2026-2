/*Arreglos: 7,8,9,10,11,12 -> si piden muchos numero llenar con numeros aleatorios

Arreglo #12: Dado una arreglo A de N elementos se quiere generar
otro arreglo que contenga las posiciones de los elementos del arreglo
dado que sean iguales a un valor x dado.
Ejemplo: A = {4,6,8,2,6,9,6,1}
        X = 6
        B = {2,5,7}
*/
import java.util.Scanner;
public class A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creacion del arreglo y lectura de los N numeros enteros
        System.out.print("Ingrese el tamaño del arreglo: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Ingrese " + N + " numeros enteros:");

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        //Lectura del valor x
        System.out.print("Ingrese el valor x: ");
        int x = sc.nextInt();

        //Creacion del arreglo B para almacenar las posiciones
        int[] B = new int[N];
        int contadorPosiciones = 0;

        //Busqueda de las posiciones de los elementos iguales a x
        for (int i = 0; i < N; i++) {
            if (A[i] == x) {
                B[contadorPosiciones++] = i + 1; //Se almacenan las posiciones en B
            }
        }

        //Impresion del arreglo B con las posiciones encontradas
        System.out.println("El arreglo B con las posiciones de los elementos iguales a " + x + " es:");
        for (int i = 0; i < contadorPosiciones; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}
