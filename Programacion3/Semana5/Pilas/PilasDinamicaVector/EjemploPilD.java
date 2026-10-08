package Pilas.PilasDinamicaVector;
import Pilas.PilasDinamicaVector.PilaVector;
import java.util.Scanner;
public class EjemploPilD {
    public static void main(String[] args) {
        PilaVector pila = new PilaVector();
        Scanner scanner = new Scanner(System.in);
        int x;
        try {
            System.out.println("Ingrese un número de elementos: ");
            x = scanner.nextInt();
            for (int i = 0; i <= x; i++) {
                double d = scanner.nextDouble() - 1;
                pila.insertar(d);
            }
            //Vaciado pila
            System.out.println("Elementos de la pila: ");
            while(!pila.pilaVacia())
            {
                pila.mostrarPila();
                pila.eliminar();
            }
            System.out.println("Desea eliminar un elemento de la pila? (1: Sí, 0: No)");
            int opcion = scanner.nextInt();
            if(opcion == 1) {
                System.out.println("Ingrese el elemento a eliminar: ");
                double d = scanner.nextDouble();
                pila.eliminarElemento(d);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}