/*
En esta clase tomamos los metodos abstractos de la clase Sala.java
*/
public class SalaTradicional extends Sala {
    public SalaTradicional(int numero){
        super(numero);
    }

    @Override 
    public boolean admitePelicula(Pelicula p){
        return !p.getTipo().equals("3D");
    }

    @Override 
    public int calcularPrecioSilla(int fila){
        return (fila >=6) ? 12000 : 8000;
    }

    @Override 
    protected char[][] generarMatrizAsientos(){
        char[][] asientos = new char[8][];
        for (int i = 0; i < 6; i++) asientos[i] = new char[12];
        for (int i = 6; i < 8; i++) asientos[i] = new char[9];

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) asientos[i][j] = 'O';
        }
        return asientos;
    }
}
