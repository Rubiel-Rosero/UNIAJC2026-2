/*Arreglos: 7,8,9,10,11,12 -> si piden muchos numero llenar con numeros aleatorios

Arreglo #10: Dado un arreglo A de N elementos,
se desea crear otro arreglo, tal que cada uno de sus
elementos sea la suma de los opuestos en el arreglo dado.

Ejemplo: A = {8, 5, 3, 10, 2, 8, 1} -> B = {10, 13, 5, 10}
*/
import java.util.Scanner;
public class A10 {
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

        //Creacion del arreglo B con la suma de los opuestos
        int[] B = new int[N / 2];
        for (int i = 0; i < N / 2; i++) { //Se recorre la mitad del arreglo A
            B[i] = A[i] + A[N - 1 - i]; //Se suman los opuestos
        }

        //Impresion del arreglo B
        System.out.println("El arreglo B es:");
        for (int i = 0; i < B.length; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}
