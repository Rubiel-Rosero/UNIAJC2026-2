/*
Matrices: 17, 18, 19,20,21,22,24
Matriz 21: Dada una matriz de N X M elementos, hacer un programa que construya
un vector B, deonde cada uno de sus componentes sea la suma de los elementos
de valores numericos pares de las filas de la matriz.

*/
import java.util.Scanner;
public class M21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario las dimensiones de la matriz
        System.out.print("Ingrese el número de filas (N): ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (M): ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];

        // Solicitar al usuario los elementos de la matriz
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10); 
            }
        }

        System.out.println("Matriz ingresada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Construir el vector B con la suma de los elementos pares de cada fila
        int[] vectorB = new int[n];

        for (int i = 0; i < n; i++) {
            int sumaPares = 0;
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] % 2 == 0) { // Verificar si el elemento es par
                    sumaPares += matriz[i][j];
                }
            }
            vectorB[i] = sumaPares;
        }

        // Imprimir el vector B resultante
        System.out.println("Vector B (suma de elementos pares por fila):");
        for (int i = 0; i < n; i++) {
            System.out.println("Fila " + i + ": " + vectorB[i]);
        }

        scanner.close();
    }
}
