/*
donde el usuario escoge que hacer
*/
import java.util.Scanner;
public class Principal
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        int opcion;
        do
        {
            System.out.println("\n=== GESTOR DE TAREAS ===");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Completar tarea");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion)
            {
                case 1:
                    System.out.println("Descripción: ");
                    String descripcion = sc.nextLine();
                    gestor.agregarTarea(descripcion);
                    break;
                case 2:
                    gestor.mostrarTareas();
                    break;
                case 3:
                    System.out.print("Número de tarea: ");
                    int completar = sc.nextInt();
                    gestor.completarTarea(completar);
                    break;
                case 4:
                    System.out.print("Número de tarea: ");
                    int eliminar = sc.nextInt();
                    gestor.eliminarTarea(eliminar);
                    break;
                case 5:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }while(opcion != 5);
        sc.close();
    }
}
