/*
Esta es la clase principal del sistema
*/
import java.util.Scanner;
public class CineApp {
    static Pelicula[] cartelera = new Pelicula[50];
    static int numPeliculas = 0;
    static Sala[] salas = new Sala[3];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            salas[0] = new SalaTradicional(1);
            salas[1] = new SalaTradicional(2);
            salas[2] = new Sala3D(3);
            
            boolean salir = false;
            while (!salir){
                System.out.println("\n--- CINEMASTAR CALI ---");
                System.out.println("1. Creacion de Peliculas");
                System.out.println("2. Asignacion de Funciones");
                System.out.println("3. Ventas");
                System.out.println("4. Salir");

                String opcion = sc.nextLine();
                switch (opcion) {
                    case "1":
                        crearPelicula(sc);
                        break;
                    case "2":
                        asignarFuncion(sc);
                        break;
                    case "3":
                        venderEntradas(sc);
                        break;
                    case "4":
                        salir = true;
                        break;
                    default:
                        System.out.println("Opcion invalida.");
                        break;
                }
            }
            sc.close();
    }
    private static void crearPelicula(Scanner sc){
        System.out.println("\n--- PELICULAS EN CARTELERA ---");
        if (numPeliculas == 0){
            System.out.println("(La cartelera esta vacia)");
        }else{
            for (int i = 0; i < numPeliculas; i++){
                System.out.println("- " + cartelera[i].getNombre() + " (" + cartelera[i].getTipo() + ") ");
            }
        }
        System.out.println("\nNombre:");
        String nombre = sc.nextLine();
        System.out.println("Idioma:");
        String idioma = sc.nextLine();
        System.out.println("Tipo (35mm / 3D):");
        String tipo = sc.nextLine().toUpperCase();
        System.out.println("Duracion (min)");
        int duracion = Integer.parseInt(sc.nextLine());

        cartelera[numPeliculas++] = new Pelicula(nombre, idioma, tipo, duracion);
        System.out.println("Pelicula guardada");
    }
    
    private static void asignarFuncion(Scanner sc){
        if (numPeliculas == 0) return;
        System.out.println("\nSala (1-3");
        int numSala = Integer.parseInt(sc.nextLine());
        System.out.println("Franja (1: 14:00, 2: 16:30, 3: 19:00: ");
        int franja = Integer.parseInt(sc.nextLine()) - 1;

        System.out.println("Seleccione la Pelicula");
        for(int i = 0; i < numPeliculas; i++){
            System.out.println((i + 1) + ". " + cartelera[i].getNombre());
        }
        int selP = Integer.parseInt(sc.nextLine()) - 1;

        Sala salaActual = salas[numSala -1];
        if(!salaActual.admitePelicula(cartelera[selP])){
            System.out.println("Error: formato incompatible con esta sala. ");
            return;
        }
        if(salaActual.asignarFuncion(franja, cartelera[selP])){
            System.out.println("Asignada con Exito");
        }else{
            System.out.println("Error: Horario ocupado");
        }
    }
    private static void venderEntradas(Scanner sc){
        System.out.println("\nSala (1-3: ");
        int numSala = Integer.parseInt(sc.nextLine());
        System.out.println("Franja (1: 14:00, 2: 16:30, 3: 19:00): ");
        int franja = Integer.parseInt(sc.nextLine()) - 1;

        Sala salaActual = salas[numSala -1];
        Funcion funcion = salaActual.getFuncion(franja);

        if(funcion == null){
            System.out.println("No hay funcion asignada");
            return;
        }
        funcion.imprimirEsquema();
        System.out.println("Sillas (Ej: A3, B8): ");
        String[] seleccion = sc.nextLine().split(",");

        int totalPagar = 0;
        boolean valida = true;

        for(String s: seleccion){
            s = s.trim().toUpperCase();
            if (s.length() < 2) continue;

            int fila = s.charAt(0) - 'A';
            int col = Integer.parseInt(s.substring(1)) - 1;

            if (!funcion.sillaValida(fila, col)|| funcion.sillaOcupada(fila, col)){
                System.out.println("Error en la silla: " + s);
                valida = false;
                break;
            }
            totalPagar += salaActual.calcularPrecioSilla(fila);
        }
        if(valida){
            for (String s: seleccion){
                s = s.trim().toUpperCase();
                funcion.ocuparSilla(s.charAt(0) - 'A', Integer.parseInt(s.substring(1)) - 1);
            }
            System.out.println("Total pagado: $" + totalPagar);
        }
    }
}
