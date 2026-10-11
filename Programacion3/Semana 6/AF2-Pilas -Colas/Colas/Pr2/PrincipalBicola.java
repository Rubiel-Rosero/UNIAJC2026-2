public class PrincipalBicola
{
    public static void main(String[] args)
    {   
        BicolaCircular bicola = new BicolaCircular();
        System.out.println("=== SIMULACIÓN DE BICOLA CIRCULAR EN ARREGLO DE 9 POSICIONES ===");
        bicola.mostrarEstado("Estado Inicial");
        //añadir los elementos F y J por el final
        bicola.insertarFinal('F');
        bicola.insertarFinal('K');
        bicola.mostrarEstado("1. Añadir F y Y por el final");
        //añadir los elementos R, W y V por el frente
        bicola.insertarFrente('R');
        bicola.insertarFrente('W');
        bicola.insertarFrente('V');
        bicola.mostrarEstado("2. Añadir R, W, y V por el frente");
        //añadir el elemento M por el final
        bicola.insertarFinal('M');
        bicola.mostrarEstado("3. Añadir M por el final");
        //eliminar los dos caracteres del frente
        System.out.println("\nEliminando del frente: " + bicola.eliminarFrente());
        System.out.println("Eliminando del frente: " + bicola.eliminarFrente());
        bicola.mostrarEstado("Eliminar 2 elementos del frente");
        //añadir los elementos K y J por el final
        bicola.insertarFinal('K');
        bicola.insertarFinal('L');
        bicola.mostrarEstado("Añadir K y L por el final");
        //ahora intentamos añadir el elemento S por el frente
        boolean insertado = bicola.insertarFrente('S');
        if(!insertado)
        {
            bicola.mostrarEstado("Intento de añadir S por el frente fallido");
        }
    }
}
