import java.util.Vector;
public class Ejecutar {
    public static void main(String[] args) {
        //Forma 1 - creacion del arreglo
        int[] a = {2, 8, 10, 6, 15, 20, 21, 1, 3, 12};

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        //Forma 2 - creacion del arreglo de manera aleatoria
        int[] b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 10);
            System.out.println("b[" + i + "] = " + b[i]);
        }
        Vector<String> vector = new Vector<>();
        vector.add("Hola, mundo!");
        System.out.println(vector.get(0));
    }
}