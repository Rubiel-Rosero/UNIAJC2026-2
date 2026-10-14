import java.util.Scanner;
public class MainEstudiantes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        GestionEstudiantes gestor = new GestionEstudiantes();
        System.out.println("Cantidad de estudiantes a registrar: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++)
        {
            System.out.println("\n--- Estudiante " + (i + 1));
            System.out.println("Codigo: ");
            String codigo = sc.nextLine();
            System.out.println("Nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Nota final: ");
            double nota = sc.nextDouble();
            sc.nextLine();
            gestor.registrar(new Estudiante(codigo, nombre, nota));
        }
        System.out.println("\nIngrese el codigo a buscar: ");
        String codBuscar = sc.nextLine();
        Estudiante encontrado = gestor.buscarPorCodigo(codBuscar);
        if(encontrado != null)
        {
            System.out.println("Estudiante encontrado: " + encontrado);
        }else
        {
            System.out.println("No existe estudiante registrado con el codigo " + codBuscar);
        }
        sc.close();
    }
}
