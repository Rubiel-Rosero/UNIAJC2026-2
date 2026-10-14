import java.util.Scanner;
public class MainInventario 
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        GestionarInventario gestor = new GestionarInventario();
        System.out.print("¿Cuantos productos desea ingresar? ");
        int total = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < total; i++)
        {
            System.out.println("\n--- Producto "+ (i + 1));
            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            sc.nextLine();
            gestor.agregarProducto(new Producto(id, nombre, precio));
        }
        System.out.println("\n--- Reporte de inventario ---");
        System.out.println("Total registrado: " + gestor.ObtenerTotalProductos());
        for(Producto p : gestor.getListaProductos())
        {
            System.out.println(p);
        }
        sc.close();
    }
}
