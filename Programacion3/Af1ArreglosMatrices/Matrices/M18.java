/*
Matrices: 17, 18, 19,20,21,22,24
Matriz 18 Realice un programa que calcule la tabla de multiplicar
de 1 a 10 almacenando los valores en una tabla. Imprimir dicha tabla.
*/
public class M18 {
    public static void main(String[] args) {
        int[][] tablaMultiplicar = new int[10][10];

        // Calcular la tabla de multiplicar
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablaMultiplicar[i][j] = (i + 1) * (j + 1);
            }
        }

        // Imprimir la tabla de multiplicar
        System.out.println("Tabla de Multiplicar:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablaMultiplicar[i][j] + "\t");// Usar tabulación para alinear los números (/t)
            }
            System.out.println();
        }
    }
}
