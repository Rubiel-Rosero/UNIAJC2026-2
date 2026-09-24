public class Matrices {
    public static void main(String[] args) {
        System.out.println("Matrices");

        // Declarar una matriz forma 1
        int[][] matriz = {{5, 8, 6}, {1, 3, 2}, {4, 9, 7}};

        //recorrer la matriz con un ciclo for anidado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) { // m[0].length sera siempre para recorrer las columnas
                System.out.print("m["+""+i+"]["+j+"] = "+matriz[i][j]+" ");
            }
            System.out.println();
        }

        //Visualizar de mejor manera la matriz
        String cad = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) { // m[0].length sera siempre para recorrer las columnas
                cad += "|"+matriz[i][j];
            }
            cad += "|\n";
        }
        System.out.println(cad);
        // Declarar una matriz de textos de 2 filas y 2 columnas
        String[][] nombres = new String[2][2];
    }
}