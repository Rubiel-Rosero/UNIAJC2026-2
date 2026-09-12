/*
Matrices: 17, 18, 19,20,21,22,24

Matriz 17: Sumar los elementos de cada fila y cada columna de una matriz
*/
public class M17 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Sumar elementos de cada fila
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }

        // Sumar elementos de cada columna
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumna);
        }
    }
}
