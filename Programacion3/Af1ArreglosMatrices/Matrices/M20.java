/*
Matrices: 17, 18, 19,20,21,22,24
Matriz 20: Codificar una matriz 10 x 10 de numero randoms con ceros en la diagonal
principal hacia arriba.
*/
public class M20 {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        int[][] matriz = new int[n][m];

        // Asignar números aleatorios y ceros en la diagonal principal hacia arriba
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j >= i) { // Asignar 0 a los elementos de la diagonal principal hacia arriba
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = (int) (Math.random() * 10); 
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
