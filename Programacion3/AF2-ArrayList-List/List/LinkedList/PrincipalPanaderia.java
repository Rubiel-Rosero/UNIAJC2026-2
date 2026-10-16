import java.util.Scanner;
public class PrincipalPanaderia
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Panaderia panaderia = new Panaderia();
        int opcion;
        do
        {
            System.out.println("\n=== PANADERIA ===");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Mostrar fila");
            System.out.println("3. Atender cliente");
            System.out.println("4. Ver cantidad de clientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion)
            {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    panaderia.registrarCliente(nombre);
                    break;
                case 2:
                    panaderia.mostrarFila();
                    break;
                case 3:
                    panaderia.atenderCliente();
                    break;
                case 4:
                    panaderia.mostrarCantidad();
                    break;
                case 5:
                    System.out.println("Programa finalizado");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 5);
        sc.close();
    }
}
