/*
Esta clase se encargara de guardar los datos de las peliculas (clase fundamental)
va a tener 4 atributos basicos requeridos: Nombre, idioma, tipo y duracion.
*/
public class Pelicula{
    private String nombre;
    private String idioma;
    private String tipo;
    private int duracion;

    public Pelicula(String nombre, String idioma, String tipo, int duracion){
        this.nombre = nombre;
        this.idioma = idioma;
        this.tipo = tipo;
        this.duracion = duracion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getIdioma(){
        return idioma;
    }

    public String getTipo(){
        return tipo;
    }

    public int getDuracion(){
        return duracion;
    }
}