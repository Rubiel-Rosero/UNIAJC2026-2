/*Arreglos: 7,8,9,10,11,12 -> si piden muchos numero llenar con numeros aleatorios

Arreglo #7: Obtener dos arreglos tal que sus elementos sean los numeros pares
e impares de un arreglo (A) de 10 elementos.
*/
public class A7{
    public static void main(String[] args) {
        //Creacion del arreglo A con 10 elementos
        int[] A = {2, 8, 10, 6, 15, 20, 21, 1, 3, 12};

        //declaracion de los arreglos pares e impares
        int[] pares = new int[10];
        int[] impares = new int[10];

        //inicializacion de los indices
        int b = 0;
        int c = 0;

        //Recorrido del arreglo A y llenado de los arreglos pares e impares
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                pares[b] = A[i];
                b++;
            } else {
                impares[c] = A[i];
                c++;  
            }
        }

        //Impresion de los arreglos pares e impares
        System.out.println("Arreglo de pares:");
        for (int i = 0; i < b; i++) {
            System.out.println(pares[i]);
        }
        System.out.println("Arreglo de impares:");
        for (int i = 0; i < c; i++) {
            System.out.println(impares[i]);
        }
    }
}
