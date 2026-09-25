/*
Esta clase va ser abstracta y va a definir las reglas generales de todas las salas.
*/
public abstract class Sala {
    protected int numero;
    protected Funcion[] funciones;

    public Sala(int numero){
        this.numero = numero;
        this.funciones = new Funcion[3];
    }

    public int getNumero(){
        return numero;
    }
    
    public Funcion getFuncion(int franja, Pelicula p){
        return funciones[franja];
    }

    public boolean asignarFuncion(int franja, Pelicula p){
        if(funciones[franja] != null) return false;

        char[][] asientosNuevos = generarMatrizAsientos();
        funciones[franja] = new Funcion(p, asientosNuevos);
        return true;
    }

    public abstract boolean admitePelicula(Pelicula p);
    public abstract int calcularPrecioSilla(int fila);
    protected abstract char[][] generarMatrizAsientos();
}
