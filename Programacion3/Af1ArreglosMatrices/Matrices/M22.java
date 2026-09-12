/*
Matrices: 17, 18, 19,20,21,22,24
Matriz 22: Escribir un programa que lea las dimensiones de una matriz,
lea y visualice la matriz y a continuacion encuentre el mayor elemento
de la matriz y sus posiciones.
*/
import java.util.Scanner;
public class M22 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (N): ");
        int n = sc.nextInt();              

        System.out.print("Ingrese el número de columnas (M): ");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        // Llenar la matriz con valores aleatorios
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        // Visualizar la matriz
        System.out.println("Matriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Encontrar el mayor elemento y sus posiciones
        int mayor = matriz[0][0];
        String posiciones = "Posiciones del mayor elemento: ";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    posiciones = "Posiciones del mayor elemento: (" + i + ", " + j + ")";
                } else if (matriz[i][j] == mayor) {
                    posiciones += " (" + i + ", " + j + ")";
                }
            }
        }

        // Imprimir el mayor elemento y sus posiciones
        System.out.println("Mayor elemento: " + mayor);
        System.out.println(posiciones);

        sc.close();

    }
}
