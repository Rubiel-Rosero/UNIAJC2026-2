import java.util.Objects;

public class Estudiante
{
    private String codigo;
    private String nombre;
    private double notaFinal;
    public Estudiante(String codigo, String nombre, double notaFinal)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }
    public String getCodigo()
    {
        return codigo;
    }
    public String getNombre()
    {
        return nombre;
    }
    public double getNotaFinal()
    {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal)
    {
        this.notaFinal = notaFinal;
    }
    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(o == null || getClass() != o.getClass())
        {
            return false;
        }
        Estudiante queEstudiante = (Estudiante) o;
        return Objects.equals(codigo, queEstudiante.codigo);
    }
    @Override
    public String toString()
    {
        return "Codigo: "+ codigo + " Nombre: " + nombre + " Nota: " + notaFinal;
    }
}
