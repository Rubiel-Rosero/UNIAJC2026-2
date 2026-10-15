import java.util.Scanner;
public class MainTareas
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        GestionTareas gestor = new GestionTareas();
        int idContador = 1;
        int opcion;
        do
        {
            System.out.println("\n--- Menu Gestor de Tareas ---");
            System.out.println("1. Agregar tarea");;
            System.out.println("2. Ver todas la tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea por indice");
            System.out.println("5. Salir");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion)
            {
                case 1:
                    System.out.println("Descripcion de la tarea: ");
                    String desc = sc.nextLine();
                    gestor.agregarTarea(new Tarea(idContador++, desc));
                    System.out.println("Tarea agregada");
                    break;
                case 2:
                    if(gestor.estaVacia())
                    {
                        System.out.println("No hay tareas registradas.");
                    }else
                    {
                        System.out.println("\n--- Lista de tareas ---");
                        for(int i = 0; i < gestor.getListaTareas().size(); i++)
                        {
                            System.out.println("Posicion " + i + gestor.getListaTareas().get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Indice de la tarea a completar: ");
                    int idxComp = sc.nextInt();
                    if(gestor.completarTarea(idxComp))
                    {
                        System.out.println("Tarea marcada como completada");
                    }else
                    {
                        System.out.println("Indice fuera del rango");
                    }
                    break;
                case 4:
                    System.out.println("Indice de la tarea a eliminar: ");
                    int idxElim = sc.nextInt();
                    Tarea eliminada = gestor.eliminarTarea(idxElim);
                    if(eliminada != null)
                    {
                        System.out.println("Se elimino: " + eliminada);
                    }else
                    {
                        System.out.println("Indice fuera de rango");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 5);
        sc.close();
    }
}
