/*
Matrices: 17, 18, 19,20,21,22,24
Matriz 19: codificar un programa que genere una matriz de n x m, 
en la cual asigne ceros a todos los elementos, excepto a los de 
la diagonal principal donde se asignar el valor 1. Imprimir la matriz resultante.
*/
public class M19 {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] matriz = new int[n][m];

        // Asignar ceros a todos los elementos y 1 a la diagonal principal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {// Asignar 1 a los elementos de la diagonal principal
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Imprimir la matriz resultante
        System.out.println("Matriz resultante:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
