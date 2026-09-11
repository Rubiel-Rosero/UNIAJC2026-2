/*Arreglos: 7,8,9,10,11,12 -> si piden muchos numero llenar con numeros aleatorios

Arreglo #8: Elaborar un programa que lea 30 numeros y que imprima el numero mayor,
menor y el numero de veces que se repiten ambos
*/
public class A8{
    public static void main(String[] args) {
        int [] a = new int[30];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 30);
        }
        int mayor = a[0];
        int menor = a[0];
        int vecesMayor = 0;
        int vecesMenor = 0;

        //Recorrido del arreglo para encontrar el mayor y menor
        for (int i = 0; i < a.length; i++) {
            if (a[i] > mayor) {
                mayor = a[i];
            }
            if (a[i] < menor) {
                menor = a[i];
            }
        }
        //Recorrido del arreglo para contar las veces que se repite el mayor y menor
        for (int i = 0; i < a.length; i++) {
            if (a[i] == mayor) {
                vecesMayor++;
            }
            if (a[i] == menor) {
                vecesMenor++;
            }
        }
        
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero de veces que se repite el mayor es: " + vecesMayor);
        System.out.println("El numero de veces que se repite el menor es: " + vecesMenor);
    }
}