public class Sala3D extends Sala {
    public Sala3D(int numero){
        super(numero);
    }

    @Override 
    public boolean admitePelicula(Pelicula p){
        return p.getTipo().equals("3D");
    }

    @Override
    public int calcularPrecioSilla(int fila){
        return 10000;
    }

    @Override 
    protected char[][] generarMatrizAsientos(){
        char[][] asientos = new char[6][12];
        for (int i = 0; i < asientos.length; i++){
            for(int j = 0; j < asientos[i].length; j++) asientos[i][j] = 0;
        }
        return asientos;
    }
}
