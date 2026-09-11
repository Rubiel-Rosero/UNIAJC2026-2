/*Arreglos: 7,8,9,10,11,12 -> si piden muchos numero llenar con numeros aleatorios

Arreglo #11: Dado un arreglo A de N elementos se desea generar tres arreglos
que contengan los elementos negativos, cero y positivos de arreglo inicial.
*/
import java.util.Scanner;
public class A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int N = sc.nextInt();
        int[] A = new int[N];
        System.out.println("Ingrese " + N + " numeros enteros:");

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        //Creacion de los arreglos para negativos, ceros y positivos
        int[] negativos = new int[N];
        int[] ceros = new int[N];
        int[] positivos = new int[N];

        //Contadores para cada tipo de numero
        int contadorNegativos = 0, contadorCeros = 0, contadorPositivos = 0;

        //Clasificacion de los elementos del arreglo A
        for (int i = 0; i < N; i++) { //Se recorre el arreglo A
            if (A[i] < 0) {
                negativos[contadorNegativos++] = A[i];//Se agregan los negativos al arreglo de negativos
            } else if (A[i] == 0) {
                ceros[contadorCeros++] = A[i];
            } else {
                positivos[contadorPositivos++] = A[i];
            }
        }

        //Impresion de los arreglos resultantes
        System.out.println("Arreglo de negativos:");
        for (int i = 0; i < contadorNegativos; i++) {
            System.out.println("negativos[" + i + "] = " + negativos[i]);
        }

        System.out.println("Arreglo de ceros:");
        for (int i = 0; i < contadorCeros; i++) {
            System.out.println("ceros[" + i + "] = " + ceros[i]);
        }

        System.out.println("Arreglo de positivos:");
        for (int i = 0; i < contadorPositivos; i++) {
            System.out.println("positivos[" + i + "] = " + positivos[i]);
        }
    }
}
