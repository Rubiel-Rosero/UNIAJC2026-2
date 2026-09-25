/*
Clase para controlar la disponibilidad de los asientos y la pelicula asignada.
*/
public class Funcion {
    private Pelicula pelicula;
    private char[][] asientos;
    private int entradasDisponibles;

    public Funcion(Pelicula pelicula, char[][] asientosIniciales){
        this.pelicula = pelicula;
        this.asientos = asientosIniciales;

        //calculo de las sillas totales en la matriz
        this.entradasDisponibles = 0;
        for (int i = 0; i < asientos.length; i++){
            this.entradasDisponibles += asientos[i].length;
        }
    }

    public Pelicula getPelicula(){
        return pelicula;
    }

    public int getEntradasDisponibles(){
        return entradasDisponibles;
    }

    public boolean sillaValida(int fila, int col){
        return fila >= 0 && fila < asientos.length && col >= 0 && col < asientos[fila].length;
    }

    public boolean sillaOcupada(int fila, int col){
        return asientos[fila][col] == 'X';
    }

    public void ocuparSilla(int fila, int col){
        asientos[fila][col] = 'X';
        entradasDisponibles--;
    }

    public void imprimirEsquema(){
        System.out.println("\n--- PANTALLA ---");
        for (int i = asientos.length - 1; i >= 0; i--){
            char letra = (char) ('A' + i);
            System.out.print(letra + "  ");

            if (asientos[i].length == 9){
                System.out.print(" ");
            }

            for(int j = 0; j < asientos[i].length; j++){
                System.out.print(asientos[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
