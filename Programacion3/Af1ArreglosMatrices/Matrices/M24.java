/*
Matrices: 17, 18, 19,20,21,22,24
Matriz 24: Se tiene la produccion total de toneladas de cereales (arroz, avena, cebada, trigo)
cosechadas durante cada mes del año anterior. Eleborar un programa que proporcione
la siguiente informacion:
a. El promedio anual de toneladas cosechadas.
b. cuantos meses tuvieron cosecha superior al promedio anual.
c. cuantos meses tuvieron cosecha inferior al promedio anual.
d. cual fue el mes en que se produjeron mayor numero de toneladas.
*/
public class M24 {
    public static void main(String[] args){

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // Matriz para almacenar la producción de cereales (arroz, avena, cebada, trigo) durante cada mes
        double[][] produccion = new double[12][4];

        // Generar producción aleatoria para cada cereal en cada mes
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 4; j++){
                produccion[i][j] = Math.random() * 100; // Generar producción aleatoria entre 0 y 100 toneladas
            }
        }

        // Calcular el total de producción por mes
        double[] totalPorMes = new double[12];

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 4; j++){
                totalPorMes[i] += produccion[i][j];
            }
        }
        
        // Calcular el promedio anual de toneladas cosechadas
        double totalAnual = 0;

        for(int i = 0; i < 12; i++){
            totalAnual += totalPorMes[i];
        }

        // Calcular el promedio anual
        double promedioAnual = totalAnual / 12;

        int mesesSuperiorPromedio = 0;
        int mesesInferiorPromedio = 0; 

        // Contar los meses con cosecha superior e inferior al promedio anual
        for(int i = 0; i < 12; i++){
            if(totalPorMes[i] > promedioAnual){
                mesesSuperiorPromedio++;
            } else if(totalPorMes[i] < promedioAnual){
                mesesInferiorPromedio++;
            }
        }
        
        // Encontrar el mes con mayor producción
        double mayorProduccion = totalPorMes[0];
        int mesMayorProduccion = 0;

        for(int i = 0; i < 12; i++){
            if(totalPorMes[i] > mayorProduccion){
                mayorProduccion = totalPorMes[i];
                mesMayorProduccion = i;
            }
        }

        // Imprimir los resultados
        System.out.println("Produccion de Cereales");
        for(int i = 0; i < 12; i++){
            System.out.println(meses[i] + ": " + totalPorMes[i] + " toneladas");
        }
        System.out.println("Promedio anual de toneladas cosechadas: " + promedioAnual);
        System.out.println("Meses con cosecha superior al promedio anual: " + mesesSuperiorPromedio);
        System.out.println("Meses con cosecha inferior al promedio anual: " + mesesInferiorPromedio);
        System.out.println("Mes con mayor produccion: " + meses[mesMayorProduccion] + " con " + mayorProduccion + " toneladas");
    }
}
